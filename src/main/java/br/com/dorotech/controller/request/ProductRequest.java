package br.com.dorotech.controller.request;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductRequest implements Serializable {
    private String name;
    private String description;
    private BigDecimal price;
    private Integer amount;
}

