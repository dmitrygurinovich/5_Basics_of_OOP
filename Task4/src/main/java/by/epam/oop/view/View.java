package by.epam.oop.view;

import java.util.ArrayList;

import by.epam.oop.entity.Cave;
import by.epam.oop.entity.TreasureChest;

public class View {

	public View() {
		
	}
	
	public void print(Cave cave) {
		System.out.println(cave);
	}
	
	public void print(String text, TreasureChest chest) {
		System.out.println(text + "\n" + chest);
	}
	
	public void print(String text, ArrayList<TreasureChest> treasures) {
		StringBuilder treasuresListToString = new StringBuilder(text);
		treasuresListToString.append("\n");
		for (TreasureChest treasureChest : treasures) {
			treasuresListToString.append(treasureChest.toString()).append("\n");
		}
		System.out.println(treasuresListToString.toString());
	}
	
}
