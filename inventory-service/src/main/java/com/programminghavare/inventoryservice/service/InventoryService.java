package com.programminghavare.inventoryservice.service;

import com.programminghavare.inventoryservice.model.Inventory;
import com.programminghavare.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public List<Inventory> isInStock(List<String> skuCode) {
        return inventoryRepository.findBySkuCodeIn(Collections.singletonList(skuCode.toString()));
    }
}
