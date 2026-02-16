package com.nrbb.api.service;
import com.nrbb.api.model.Produto;
import com.nrbb.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProdutoService {
    @Autowired private ProdutoRepository repo;
    public Produto buscarPorId(Long id) { return repo.findById(id).orElseThrow(); }
    @Transactional
    public void baixarEstoque(Produto p, int qtd) {
        p.setQuantidadeEstoque(p.getQuantidadeEstoque() - qtd);
        repo.save(p);
    }
}