package by.epam.oop.main;

import java.io.IOException;

import by.epam.oop.entity.Cave;
import by.epam.oop.logic.CaveLogic;
import by.epam.oop.view.View;

/*Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
*/
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		CaveLogic logic = new CaveLogic();
		View view = new View();
		Cave cave = logic.readFromFile();

		view.print("Dragon's cave:", cave);
		view.print("The most expensive treasure chest:", logic.getTheMostExpensiveTreasureCheast(cave));
		view.print("You can get:", logic.getTreasureChestByCost(cave, 1218));

	}

}