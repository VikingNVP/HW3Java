package org.task3;

import java.util.ArrayList;
import java.util.List;


/**
 * @apiNote Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Main3 {
    public static void main(String[] args) {
        List<Books> booksList = new ArrayList<>();
        booksList.add(new Books("Война и мир", "Толстой", 290.23, 1996, 13));
        booksList.add(new Books("Берега в песке", "Морской", 200.99, 2020, 7));
        booksList.add(new Books("Песок на берегу", "Флагова", 190.99, 1800, 1));
        booksList.add(new Books("Яблоко с дерева", "Ньютон", 54.99, -400, 100));
        booksList.add(new Books("Хлеб и зрелища", "Маркс", 45.99, 1850, 200));
        booksList.add(new Books("Казаки", "Кубанцов", 20.99, 2010, 23));
        booksList.add(new Books("Морской прибой", "Матроскин", 490.23, 2023, 100));
        booksList.add(new Books("Звёзды", "Казанова", 20.99, 2017, 13));

        //System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Books books : booksList) {
            if (isPrime(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }
    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
