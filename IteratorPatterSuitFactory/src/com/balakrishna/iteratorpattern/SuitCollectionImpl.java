package com.balakrishna.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class SuitCollectionImpl implements SuitCollection{

	
	private List<Suit> suitList;
	
	public SuitCollectionImpl() {
		suitList = new ArrayList<>();
	}
	
	@Override
	public void addSuit(Suit s) {
		
		this.suitList.add(s);
		
	}

	@Override
	public void removeSuit(Suit s) {
		this.suitList.remove(s);
		
	}

	public SuitIterator iterator(SuitTypeEnum type) {
		return new SuitIteratorImpl(type, this.suitList);
	}
	
	private class SuitIteratorImpl implements SuitIterator {

		private SuitTypeEnum type;
		private List<Suit> suits;
		private int position;

		public SuitIteratorImpl(SuitTypeEnum ty,
				List<Suit> channelsList) {
			this.type = ty;
			this.suits = channelsList;
		}

		@Override
		public boolean hasNext() {
			while (position < suits.size()) {
				Suit s = suits.get(position);
				if (s.getTYPE().equals(type) || type.equals(SuitTypeEnum.ALL)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Suit next() {
			Suit c = suits.get(position);
			position++;
			return c;
		}

	}
}

