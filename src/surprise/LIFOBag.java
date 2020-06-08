package surprise;

import java.util.ArrayList;

public class LIFOBag implements IBag {

	private ArrayList<ISurprise> surpriseList;

	LIFOBag() {
		this.surpriseList = new ArrayList<ISurprise>();
	}

	@Override
	public String toString() {
		return "In bag with LIFO surprise has:\n " + surpriseList + ". ";
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.surpriseList.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		int initialSize = bagOfSurprises.size();
		for (int i = 0; i < initialSize; i++) {
			surpriseList.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		ISurprise surprise = surpriseList.get(surpriseList.size() - 1);
		surpriseList.remove(surpriseList.get(surpriseList.size() - 1));
		return surprise;
	}

	@Override
	public ISurprise takeObject() {
		ISurprise surprise = surpriseList.get(surpriseList.size() - 1);
		return surprise;
	}

	@Override
	public boolean isEmpty() {
		if (this.surpriseList.size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.surpriseList.size();
	}
}