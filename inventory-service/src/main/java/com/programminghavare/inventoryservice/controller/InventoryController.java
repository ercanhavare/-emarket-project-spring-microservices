package com.programminghavare.inventoryservice.controller;

import com.programminghavare.inventoryservice.model.Inventory;
import com.programminghavare.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public List<Inventory> isInStock(@PathVariable("sku-code") List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
