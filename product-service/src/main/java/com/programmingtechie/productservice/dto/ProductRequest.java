package com.programmingtechie.productservice.dto;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
