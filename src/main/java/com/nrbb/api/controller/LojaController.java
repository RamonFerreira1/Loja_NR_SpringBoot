package com.nrbb.api.controller;
import com.nrbb.api.dto.CheckoutRequestDTO;
import com.nrbb.api.model.Pedido;
import com.nrbb.api.patterns.facade.CheckoutFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/loja")
public class LojaController {
    @Autowired private CheckoutFacade facade;
    @PostMapping("/checkout")
    public Pedido checkout(@RequestBody CheckoutRequestDTO dto) { return facade.realizarCheckout(dto); }
}