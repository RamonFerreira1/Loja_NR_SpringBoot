package com.nrbb.api.dto;
import lombok.Data;
import java.util.List;
@Data
public class CheckoutRequestDTO {
    private List<ItemCompraDTO> itens;
    private String metodoPagamento;
}