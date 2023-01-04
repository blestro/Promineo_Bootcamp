package week6;

import java.util.List;

public class Card {
	
	private int value;
	private String name;

	
	public Card(int value, String name) {
		this.setValue(value);
		this.setName(name);
	}
	
	public void describe() {
		String strValue = "";
//		System.out.println(this.value);
		switch (this.value) {
		case 2:
			strValue = "Two";
			break;
		case 3:
			strValue = "Three";
			break;
		case 4:
			strValue = "Four";
			break;
		case 5:
			strValue = "Five";
			break;
		case 6:
			strValue = "Six";
			break;
		case 7:
			strValue = "Seven";
			break;
		case 8:
			strValue = "Eight";
			break;
		case 9:
			strValue = "Nine";
			break;
		case 10:
			strValue = "Ten";
			break;
		case 11:
			strValue = "Jack";
			break;
		case 12:
			strValue = "Queen";
			break;
		case 13:
			strValue = "King";
			break;
		case 14:
			strValue = "Ace";
			break;
		}
		System.err.println(strValue + " of " + this.name);
	}
	
	public void setValue(int value) {
		if (value >= 2 && value <= 14) {
			this.value = value;
		} else {
			System.out.println("That Value cannot be set");
		}
			
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}

	public String getName() {  
		return name;
	}


	
}
