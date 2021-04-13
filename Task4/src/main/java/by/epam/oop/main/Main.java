package by.epam.oop.main;

import java.io.IOException;
import java.util.ArrayList;

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

		ArrayList<TreasureChest> treasureBase = new ArrayList<>();

		// Ring ring, Earring earring, Necklace necklace, Gem gem, Gold gold
		for (int i = 0; i < 16; i++) {
			treasureBase.add(new TreasureChest(new Ring("Silver ring", Main.getRandomNumber()),
					new Earring("Gold earring", Main.getRandomNumber()),
					new Necklace("Silver necklace", Main.getRandomNumber()), new Gem("Rubin", Main.getRandomNumber()),
					new Gold()));
		}

		// Ring ring, Earring earring, Necklace necklace, Gem gem
		for (int i = 0; i < 16; i++) {
			treasureBase.add(new TreasureChest(new Ring("Gold ring", Main.getRandomNumber()),
					new Earring("Silver earring", Main.getRandomNumber()),
					new Necklace("Gold necklace", Main.getRandomNumber()),
					new Gem("Sapphire", Main.getRandomNumber())));
		}

		// Ring ring, Earring earring, Necklace necklace, Gold gold
		for (int i = 0; i < 17; i++) {
			treasureBase.add(new TreasureChest(new Ring("Silver ring", Main.getRandomNumber()),
					new Earring("Gold earring", Main.getRandomNumber()),
					new Necklace("Silver necklace", Main.getRandomNumber()), new Gold(Main.getRandomNumber())));
		}

		// Ring ring, Earring earring, Gem gem, Gold gold
		for (int i = 0; i < 17; i++) {
			treasureBase.add(new TreasureChest(new Ring("Gold ring", Main.getRandomNumber()),
					new Earring("Silver earring", Main.getRandomNumber()), new Gem("Diamond", Main.getRandomNumber()),
					new Gold(Main.getRandomNumber())));
		}

		// Ring ring, Necklace necklace, Gem gem, Gold gold
		for (int i = 0; i < 17; i++) {
			treasureBase.add(new TreasureChest(new Ring("Silver Ring", Main.getRandomNumber()),
					new Necklace("Gold necklace", Main.getRandomNumber()), new Gem("Demantoid", Main.getRandomNumber()),
					new Gold(Main.getRandomNumber())));
		}

		// Earring earring, Necklace necklace, Gem gem, Gold gold
		for (int i = 0; i < 17; i++) {
			treasureBase.add(new TreasureChest(new Earring("Gold earring", Main.getRandomNumber()),
					new Necklace("Silver necklace", Main.getRandomNumber()), new Gem("Citrine", Main.getRandomNumber()),
					new Gold(Main.getRandomNumber())));
		}

		Cave cave = new Cave(treasureBase);
		CaveLogic logic = new CaveLogic();
		logic.writeToFile(cave);

	}

	public static int getRandomNumber() {
		return (int) (Math.random() * 100);
	}

}
