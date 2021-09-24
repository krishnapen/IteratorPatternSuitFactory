package com.balakrishna.iteratorpattern;

public interface SuitCollection {
	
	public void addSuit(Suit c);
	
	public void removeSuit(Suit c);
	
	public SuitIterator iterator(SuitTypeEnum type);

}
