package br.com.dorotech.service.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDomain {
    private String name;
    private String description;
    private BigDecimal price;
    private Integer amount;
}
