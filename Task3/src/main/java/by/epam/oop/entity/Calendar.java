package by.epam.oop.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Calendar {
	private ArrayList<Day> days;

	public Calendar(Day... day) {
		this.days = new ArrayList<Day>(Arrays.asList(day));
	}

	public Calendar() {

	}

	public ArrayList<Day> getDays() {
		return days;
	}

	public void setDays(ArrayList<Day> days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [days=" + days + "]";
	}

	public class Day {
		private Date date;
		private String name;

		public SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.Y", Locale.ENGLISH);

		public Day(String date, String name) {
			try {
				this.date = dateFormat.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			this.name = name;
		}

		public Day() {

		}

		public Date getDay() {
			return date;
		}

		public void setDay(Date day) {
			this.date = day;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "Date: " + dateFormat.format(date) + " - " + name;
		}

	}
}