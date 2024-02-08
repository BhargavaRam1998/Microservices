package com.programmingtechie.inventoryservice.controller;

import com.programmingtechie.inventoryservice.dto.InventoryResponse;
import com.programmingtechie.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    //the below line shows format of http request if there is only one path variable which is skucode
    //http://localhost:8082/api/inventory/iphone-13

    //now we are trying to collect all the skucodes present in an order and make them as a list and then pass it to the request
    //the format looks like this
    //http://localhost:8082/api/inventory?sku-code=iphone-13&sku-code=iphone13-red
    //the reason for the above is, one order might contain many order line items and each order line item contains a sku-code

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
       return inventoryService.isInStock(skuCode);
    }

}
