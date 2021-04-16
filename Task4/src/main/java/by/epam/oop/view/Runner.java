package by.epam.oop.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import by.epam.oop.entity.Cave;
import by.epam.oop.logic.CaveLogic;

public class Runner {
	private CaveLogic logic;
	private View view;
	private Cave cave;
	private Scanner in;
	
	public Runner() {
		this.in = new Scanner(System.in);
		this.logic = new CaveLogic();
		this.view = new View();
		try {
			this.cave = this.logic.readFromFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void menu() {
		int menuItem;
		view.print(""
				+ "###########################################\n"
				+ "1. Show all treasure chest.\n"
				+ "2. Show the most expensive treasure.\n"
				+ "3. Choose treasure acording amount you have.\n"
				+ "4. Exit.\n"
				+ "###########################################\n");

		while (!in.hasNextInt()) {
			in.next();
			view.print("Wrong choice!");
			view.print(""
					+ "###########################################\n"
					+ "1. Show all treasure chest.\n"
					+ "2. Show the most expensive treasure.\n"
					+ "3. Choose treasure acording amount you have.\n"
					+ "4. Exit.\n"
					+ "###########################################\n");
		}
		
		menuItem = in.nextInt();

		switch (menuItem) {
		case 1:
			view.print("Dragon's treasures:", cave);
			menu();
		case 2:
			view.print("The most expensive treasure:", logic.getTheMostExpensiveTreasureCheast(cave));
			menu();
		case 3:
			view.print("Treasures acording amount you have:", logic.getTreasureChestByCost(cave, getAmount()));
			menu();
		case 4:
			in.close();
			System.exit(0);
		default:
			view.print("Wrong choice!");
			menu();
		}

	}
	
	public int getAmount() {
		int amount;
		view.print("Enter amount you have:\n");
		
		while (!in.hasNextInt()) {
			in.next();
			view.print("Enter amount you have:\n");
		}
		
		amount = in.nextInt();
		
		return amount;
	}
}
