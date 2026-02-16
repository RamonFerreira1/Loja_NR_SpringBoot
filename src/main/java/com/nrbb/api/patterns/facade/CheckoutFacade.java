package com.nrbb.api.patterns.facade;
import com.nrbb.api.dto.*;
import com.nrbb.api.model.*;
import com.nrbb.api.patterns.strategy.PagamentoStrategy;
import com.nrbb.api.repository.PedidoRepository;
import com.nrbb.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.*;

@Service
public class CheckoutFacade {
    @Autowired private ProdutoService prodService;
    @Autowired private PedidoRepository pedRepo;
    @Autowired private Map<String, PagamentoStrategy> estrategias;

    public Pedido realizarCheckout(CheckoutRequestDTO req) {
        Pedido pedido = new Pedido();
        BigDecimal total = BigDecimal.ZERO;
        for (ItemCompraDTO itemDto : req.getItens()) {
            Produto p = prodService.buscarPorId(itemDto.getProdutoId());
            prodService.baixarEstoque(p, itemDto.getQuantidade());
            total = total.add(p.getPreco().multiply(BigDecimal.valueOf(itemDto.getQuantidade())));
        }
        pedido.setValorTotal(total);
        estrategias.get(req.getMetodoPagamento().toUpperCase()).processarPagamento(total);
        return pedRepo.save(pedido);
    }
}