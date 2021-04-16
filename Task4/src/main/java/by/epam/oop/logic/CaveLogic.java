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

	public ArrayList<TreasureChest> getTreasureChestByCost(Cave cave, int cost) {
		ArrayList<TreasureChest> chooseList = new ArrayList<>();

		cave.getCheastList().sort(new Comparator<TreasureChest>() {
			@Override
			public int compare(TreasureChest o1, TreasureChest o2) {
				return o1.getTotalCost() - o2.getTotalCost();
			}
		});

		int lastElement = cave.getCheastList().size() - 1;
		for (int i = lastElement; i >= 0; i--) {

			if (cave.getCheastList().get(i).getTotalCost() < cost
					&& cave.getCheastList().get(0).getTotalCost() <= cost) {
				chooseList.add(cave.getCheastList().get(i));
				lastElement--;
				cost = cost - cave.getCheastList().get(i).getTotalCost();
			}

		}
		
		cave.getCheastList().sort(new Comparator<TreasureChest>() {
			@Override
			public int compare(TreasureChest o1, TreasureChest o2) {
				return o1.getNumber() - o2.getNumber();
			}
		});

		return chooseList;
	}
}
