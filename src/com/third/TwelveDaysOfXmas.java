package com.third;

public class TwelveDaysOfXmas {

	public static void main (String[] args) {
		
		for (int day = 1; day <= 12; day++) {
			System.out.print("On the " + day);
			
		switch (day) {
		case 1:
			System.out.print("st");
			break;
		case 2:
			System.out.print("nd");
			break;
		case 3:
			System.out.print("rd");
			break;
		default:
			System.out.print("th");
			break;
		}
		System.out.println(" day of Xmas my true love gave to me");
		
		switch (day) {
		case 12:
			System.out.println("12 drummers drumming.");
			break;
		case 11:
			System.out.println("11 pipers piping,");
			break;
		case 10:
			System.out.println("10 lords a leaping,");
			break;
		case 9:
			System.out.println("9 ladies dancing,");
			break;
		case 8:
			System.out.println("8 maids a milking,");
			break;
		case 7:
			System.out.println("7 swans a swimming,");
			break;
		case 6:
			System.out.println("6 geese a laying,");
			break;
		case 5:
			System.out.println("5 golden rings,");
			break;
		case 4:
			System.out.println("4 calling birds,");
			break;
		case 3:
			System.out.println("3 french horns,");
			break;
		case 2:
			System.out.println("2 turtle doves,");
			break;
		default:
			System.out.println("a partridge in a pear tree,");
			break;
		
		}
	}
}
}
