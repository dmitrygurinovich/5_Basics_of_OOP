package by.epam.oop.main;

import by.epam.oop.entity.*;

/*Задача 5.
	Создать консольное приложение, удовлетворяющее следующим требованиям:
	• Корректно спроектируйте и реализуйте предметную область задачи.
	• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
	• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
	• для проверки корректности переданных данных можно применить регулярные выражения.
	• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
	• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
	Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
подарок). Составляющими целого подарка являются сладости и упаковка.*/

public class Main {
	
	public static void main(String[] args) {

		
		  Gift giftForMum = new Gift.Builder()
				  .buildPackaging(Packaging.CARDBOARD_BOX)
				  .buildСhocolateСandies("The best candies", 10)
				  .buildSoda("Fanta", 3) .build();
		  
		  System.out.println(giftForMum);
		  
		  Gift giftForWife = new Gift.Builder()
				  .buildPackaging(Packaging.CRAFT_PAPER)
				  .buildLollipops("sw", 45)
				  .buildСookie("The best cookies", 7)
				  .buildSoda("7 Up", 4)
				  .build();
		  
		  System.out.println(giftForWife);
		 
		
	}
	
}
