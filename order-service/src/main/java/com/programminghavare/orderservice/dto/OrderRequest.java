package com.programminghavare.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

 /*   {
        "orderLineItemsDtoList":[
        {
            "skuCode":"iphone_13",
                "price":1200,
                "quantity":1
        }
    ]
    }*/

    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
