package org.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Помидоры", "Россия", 290.23, 329.99, 1));
        products.add(new Product("Авокадо", "Тайланд", 200.99, 225.0, 3));
        products.add(new Product("Масло подсолнечное", "Россия", 190.99, 180.0, 2));
        products.add(new Product("Картофель", "Белорусия", 54.99, 10.0, 1));
        products.add(new Product("Хлеб пшеничный", "Россия", 45.99, 400.0, 2));
        products.add(new Product("Огурцы", "Россия", 20.99, 52.05, 1));
        products.add(new Product("Бананы", "Малайзия", 49.23, 1.0, 1));
        products.add(new Product("Натахтари", "Грузия", 70.99, 523.05, 1));

/**
 * @apiNote Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 * @return Выводит в консоль нужный по условию товар
 */
        //System.out.println(products);
        int ourVariety = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Введите номер сорта (1, 2, 3)");
            String variety = scanner.nextLine();
            try {
                if (Integer.parseInt(variety) > 0 && Integer.parseInt(variety) <= 3) {
                    flag = false;
                    ourVariety = Integer.parseInt(variety);
                }
            } catch (Exception e) {
                System.out.println("Это не число 1, 2, 3. Попробуйте еще раз.");
            }
        }
        scanner.close();

        double minPrice = products.get(0).getPrice();
        for (Product product : products) {

            if (product.getVariety().equals(ourVariety)) {
                if (product.getPrice() < minPrice) {
                    minPrice = product.getPrice();
                }
            }
        }
        StringBuilder ourNames = new StringBuilder();
        for (Product product : products) {

            if (product.getVariety().equals(ourVariety) && (product.getPrice() == minPrice)) {
                ourNames.append(product.getName()).append("\n");
            }
        }
        System.out.println("Самые бюджетные товары сорта " + ourVariety + ": \n" + ourNames);


    }
}
