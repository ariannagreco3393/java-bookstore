package com.soprasteria;

public class Main {

	public static void main(String[] args) {
		String title = "Il Piccolo Principe";
		float price = 12.99f;
		String author = "antoine de saint-exupery";
		String isbn = "9783140464079";
		boolean availability = true;
		int stock = 34;
		int year = 1993;
		int pages = 87;
		
		//operazioni
		
		String book = title + " " + author;
		System.out.println(book);
		float sale = price / 100 * 20;
		System.out.println(sale);
		float newPrice = price - sale;
		System.out.println(newPrice);

		
		
		
		
		
		
		
	}

}

