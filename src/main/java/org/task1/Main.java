package org.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    /**
     * @apiNote Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     * @param args
     */
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Йогурт низший", 10, 3));
        products.add(new Product("Йогурт низкий", 12, 3));
        products.add(new Product("Йогурт средний", 50, 2));
        products.add(new Product("Йогурт средний", 20, 3));
        products.add(new Product("Йогурт высший", 100, 1));
        products.add(new Product("Йогурт высший", 80, 2));
        products.add(new Product("Йогурт высокий", 150, 1));

        String searchName = "высший";
        Integer maxVariety = 0;
        String maxPriceVarietyNames = "";
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(searchName) &&
                    (product.getVariety() == 1 || product.getVariety() == 2)) {
                if (maxVariety < product.getPrice()) {
                    maxVariety = product.getPrice();
                }
            }
        }

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(searchName) &&
                    (product.getVariety() == 1 || product.getVariety() == 2)) {
                if (Objects.equals(product.getPrice(), maxVariety)) {

                    maxPriceVarietyNames += product.getName() + "\n";
                }
            }
        }
        System.out.println("Самые дорогие товары первого и второго сорта, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceVarietyNames);
        System.out.println("Наибольшая цена: " + maxVariety);
    }
}