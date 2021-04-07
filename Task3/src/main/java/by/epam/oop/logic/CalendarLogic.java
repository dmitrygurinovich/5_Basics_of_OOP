package by.epam.oop.logic;

import by.epam.oop.entity.Calendar;
import by.epam.oop.entity.Calendar.Day;

public class CalendarLogic {

	public CalendarLogic() {

	}

	public void addDate(Calendar calendar, Day day) {
		calendar.getDays().add(day);
		calendar.getDays().get(calendar.getDays().size() - 1).setNoteNumber(calendar.getDays().size());
	}

	public void deleteDate(Calendar calendar, int number) {
		try {
			calendar.getDays().remove(number - 1);
			for (int i = number - 1; i < calendar.getDays().size(); i++) {
				calendar.getDays().get(i).setNoteNumber(calendar.getDays().get(i).getNoteNumber() - 1);
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
