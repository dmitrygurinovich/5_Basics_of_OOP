package by.epam.oop.logic;

public class GiftBuilderLogic {

	public GiftBuilderLogic() {

	}

	public boolean checkFields(String name, int cost) {
		
		String checkPattern = "(\\w|\\s|\\d){3,30}";
		
		if (!name.matches(checkPattern) && cost <= 0) {
			System.err.println(Thread.currentThread().getStackTrace()[2].getMethodName().substring(5) 
					+ " can't be added to gift: \nField \"name\" must be longer than 3 symbols and field \"cost\" must be > 0!");
			return false;
		}  else if (!name.matches(checkPattern)) {
			System.err.println(Thread.currentThread().getStackTrace()[2].getMethodName().substring(5) 
					+ " can't be added to gift: \nField \"name\" must be longer than 3 symbols!");
			return false;
		} else if (cost <= 0) {
			System.err.println(Thread.currentThread().getStackTrace()[2].getMethodName().substring(5) 
					+ " can't be added to gift: \nField \"cost\" must be > 0!");
			return false;
		} else {
			return true;
		}
	}
}
