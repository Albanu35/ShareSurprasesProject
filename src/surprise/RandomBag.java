package surprise;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {

	private ArrayList<ISurprise> surpriseList;
	private Random randomGen;

	RandomBag() {
		this.surpriseList = new ArrayList<ISurprise>();
		this.randomGen = new Random();
	}

	@Override
	public String toString() {
		return "In bag with Random surprises has:\n " + surpriseList + ". ";
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
		ISurprise surprise = surpriseList.get(this.randomGen.nextInt(surpriseList.size()));
		surpriseList.remove(surprise);
		return surprise;
	}

	@Override
	public ISurprise takeObject() {
		ISurprise surprise = surpriseList.get(this.randomGen.nextInt(surpriseList.size()));
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