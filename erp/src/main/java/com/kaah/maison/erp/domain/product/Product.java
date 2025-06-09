package com.kaah.maison.erp.domain.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "product")
@Entity(name = "product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Double cost;

    private Integer expense;

    private Integer margin;

    private Double price;

    public Product(ProductRequestDTO data){
        this.price = data.price();
        this.margin = data.margin();
        this.expense = data.expense();
        this.cost = data.cost();
        this.name = data.name();
    }
}