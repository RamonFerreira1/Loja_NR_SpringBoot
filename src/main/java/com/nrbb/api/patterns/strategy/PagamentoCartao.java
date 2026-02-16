package com.nrbb.api.patterns.strategy;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
@Component("CARTAO")
public class PagamentoCartao implements PagamentoStrategy {
    public void processarPagamento(BigDecimal v) { System.out.println("Pagamento CARTAO de R$" + v + " processado."); }
}