package com.kaah.maison.erp.domain.product;

public record ProductResponseDTO(String id, String name, Double cost, Integer expense, Integer margin, Double price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getCost(), product.getExpense(), product.getMargin(),product.getPrice());
    }
}