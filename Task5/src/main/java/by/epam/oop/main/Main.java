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
Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
подарок). Составляющими целого подарка являются сладости и упаковка.*/
public class Main {
	public static void main(String[] args) {
		Gift giftForMum = new Gift.Builder()
				.withBar("Mars", 5)
				.withСookie("К чаю", 2)
				.withLollipops("Chupa-Chups", 3)
				.withСhocolateСandies("Грильяж", 5)
				.withSoda("Fanta", 4)
				.withPackaging("Box", 10)
				.build();
		
		Gift giftForWife = new Gift.Builder()
				.withСhocolateСandies("Столичные", 18)
				.withBar("Bounty", 3)
				.withСookie("Овсяное печенье", 4)
				.withSoda("Mirinda", 5)
				.withPackaging("Big box", 10)
				.build();
		
		System.out.println(giftForMum);
		System.out.println(giftForWife);
	}
}
