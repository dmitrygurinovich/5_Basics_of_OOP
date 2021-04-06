package by.epam.oop.main;

import by.epam.oop.entity.*;

/**
 * 3. Создать класс Календарь с внутренним классом, с помощью объектов которого
 * можно хранить информацию о выходных и праздничных днях.
 */
public class Main {
	public static void main(String[] args) {
		Calendar calendar = new Calendar(
				new Calendar().new Day("08.06.1989", "My birthday"), 
				new Calendar().new Day("26.06.1990", "My wife's birthday"),
				new Calendar().new Day("29.11.2019", "My son's birthday")
		);
		System.out.println(calendar);
	}
}
