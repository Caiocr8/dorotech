package br.com.dorotech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Builder
@Table(name = "products")
public class ProductEntity {

    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer amount;
}
