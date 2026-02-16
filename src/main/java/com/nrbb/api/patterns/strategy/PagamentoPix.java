package com.nrbb.api.patterns.strategy;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
@Component("PIX")
public class PagamentoPix implements PagamentoStrategy {
    public void processarPagamento(BigDecimal v) { System.out.println("Pagamento PIX de R$" + v + " processado."); }
}