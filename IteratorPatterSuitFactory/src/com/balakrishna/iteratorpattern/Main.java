package com.balakrishna.iteratorpattern;

public class Main {
	
	public static void main(String[] args) {
		SuitCollection suits = populateSuits();
		SuitIterator allIterator = suits.iterator(SuitTypeEnum.ALL);
		while (allIterator.hasNext()) {
			Suit s = allIterator.next();
			System.out.println(s.toString());
		}
		System.out.println("******");
		// Suit Type Iterator
		SuitIterator classicIterator = suits.iterator(SuitTypeEnum.CLASSIC);
		while (classicIterator.hasNext()) {
			Suit c = classicIterator.next();
			System.out.println(c.toString());
		}
	}

	private static SuitCollection populateSuits() {
		SuitCollection suits = new SuitCollectionImpl();
		suits.addSuit(new Suit(100, SuitTypeEnum.CLASSIC));
		suits.addSuit(new Suit(250, SuitTypeEnum.MODERN));
		suits.addSuit(new Suit(100, SuitTypeEnum.SLIMFIT));
		suits.addSuit(new Suit(150, SuitTypeEnum.ALL));
		return suits;
	}


}
