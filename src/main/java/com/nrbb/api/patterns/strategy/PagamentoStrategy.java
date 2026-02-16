package com.nrbb.api.patterns.strategy;
import java.math.BigDecimal;
public interface PagamentoStrategy { void processarPagamento(BigDecimal valor); }