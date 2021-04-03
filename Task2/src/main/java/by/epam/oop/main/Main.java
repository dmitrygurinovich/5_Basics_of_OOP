package by.epam.oop.main;

import by.epam.oop.entity.Payment;

/**
 *  2. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * 	нескольких товаров.
 */
public class Main {
    public static void main( String[] args ){
    	
        Payment payment = new Payment(new Payment().new Product("Kinder surpize", 4), new Payment().new Product("Chupa-Chups", 2));
        System.out.println(payment);
    }
}
