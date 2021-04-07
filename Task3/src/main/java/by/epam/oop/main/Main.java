package by.epam.oop.main;

import by.epam.oop.entity.*;
import by.epam.oop.logic.CalendarLogic;

/**
 * 3. Создать класс Календарь с внутренним классом, с помощью объектов которого
 * можно хранить информацию о выходных и праздничных днях.
 */
public class Main {
	public static void main(String[] args) {
		Calendar calendar = new Calendar(
				new Calendar().new Day("08.06.1989", "My birthday"),
				new Calendar().new Day("26.06.1990", "My wife's birthday"),
				new Calendar().new Day("29.11.2018", "My son's birthday"));

		CalendarLogic logic = new CalendarLogic();
		
		System.out.println(calendar);

		logic.deleteDate(calendar, 2);
		System.out.println(calendar);

		logic.addDate(calendar, new Calendar().new Day("20.03.1989", "Jack's birthday"));
		System.out.println(calendar);
	}
}
