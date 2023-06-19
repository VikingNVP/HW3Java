package org.task2;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private String countryName;
    private Double price;
    private Double weight;
    private Integer variety;
}
