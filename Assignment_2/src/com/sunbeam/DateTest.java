package com.sunbeam;

public class DateTest {
	
	static class Date{
		private int month;
		private int day;
		private int year;
		
		public Date(int month,int day,int year) {
			this.setMonth(month);
			this.setDay(day);
			this.setYear(year);
			
			
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		public void displayDate() {
			System.out.print(month+"/"+day+"/"+year);
			
			
		}
	}
	public static void main(String[] args) {
		Date d=new Date(5,12,2025);
		d.displayDate();
		System.out.println();
		
		//Updated values
		d.setMonth(12);
		d.setDay(25);
		d.setYear(2025);
		
		System.out.println("Updated Date:");
		d.displayDate();
	}

}
