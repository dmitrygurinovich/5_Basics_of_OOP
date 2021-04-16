package by.epam.oop.logic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

import by.epam.oop.entity.Cave;
import by.epam.oop.entity.TreasureChest;

public class CaveLogic {

	public CaveLogic() {

	}

	public void writeToFile(Cave cave) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("resourses/base.out"));
		out.writeObject(cave);
		out.close();
	}

	public Cave readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("resourses/base.out"));
		Cave caveFromFile = (Cave) in.readObject();
		in.close();
		return caveFromFile;
	}

	public TreasureChest getTreasureChestByNumber(Cave cave, int number) {

		for (TreasureChest chest : cave.getCheastList()) {
			if (chest.getNumber() == number) {
				return chest;
			}
		}

		return null;
	}

	public TreasureChest getTheMostExpensiveTreasureCheast(Cave cave) {
		int maxCost = Integer.MIN_VALUE;

		for (TreasureChest chest : cave.getCheastList()) {
			maxCost = Math.max(maxCost, chest.getTotalCost());
		}

		for (TreasureChest chest : cave.getCheastList()) {
			if (chest.getTotalCost() == maxCost) {
				return chest;
			}
		}

		return null;
	}
	/**
	 * 
	 * @param cave - Dragon's cave
	 * @param cost - The amount you have (coins)
	 */
	public ArrayList<TreasureChest> getTreasureChestByCost(Cave cave, int cost) {
		ArrayList<TreasureChest> temp = new ArrayList<>();

		// sort ArrayList by up
		cave.getCheastList().sort(new Comparator<TreasureChest>() {
			@Override
			public int compare(TreasureChest o1, TreasureChest o2) {
				return o1.getTotalCost() - o2.getTotalCost();
			}
		});
			
		/*
		 * если сумма больше самого дорогого - выбираем дорогой и считаем остаток если
		 * остаток меньше минимального - конец если остаток больше минимального (значит
		 * есть еще вариант) - ищем максимальный возможный сундук и так до победного
		 * конца вызываем рекурсивно метод
		 */

		return temp;
	}
}
