package by.epam.oop.main;

import java.io.IOException;

import by.epam.oop.entity.*;
import by.epam.oop.logic.CaveLogic;

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

		/*
		 * Ring ring = new Ring("Gold ring", 10); Earring earring = new
		 * Earring("Gold earring", 13); Necklace necklace = new
		 * Necklace("Gold necklace", 26); Gem gem = new Gem("Amatist", 29); Gold gold =
		 * new Gold(20);
		 * 
		 * TreasureChest first = new TreasureChest(ring, earring, necklace, gem, gold);
		 * TreasureChest second = new TreasureChest(ring, earring, necklace, gem);
		 * TreasureChest third = new TreasureChest(ring, earring, necklace, gem);
		 */

		CaveLogic logic = new CaveLogic();

		// logic.writeToFile(new Cave(first, second, third));

		Cave cave = logic.readFromFile();
		System.out.println(cave);

	}
}
