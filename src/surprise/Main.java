package surprise;

public class Main {

	public static void main(String[] args) {
		BagFactoryOptimizeStorage test = new BagFactoryOptimizeStorage();
		IBag fifoBag = test.makeBag("FIFO");

		for (int i = 0; i < 5; i++) {
			fifoBag.put(GatherSurprises.gather());
		}

		GiveSurpriseAndHug surpriseOne = new GiveSurpriseAndHug("FIFO", 1);
		surpriseOne.put(fifoBag);
		System.out.println(surpriseOne);
		surpriseOne.giveAll();

		GiveSurpriseAndApplause surpriseTwo = new GiveSurpriseAndApplause("LIFO", 7);
		surpriseTwo.put(fifoBag);
		System.out.println(surpriseTwo);
		surpriseTwo.giveAll();

		GiveSurpriseAndSing surpriseThree = new GiveSurpriseAndSing("RANDOM", 5);
		surpriseThree.put(fifoBag);
		System.out.println(surpriseThree);
		surpriseThree.giveAll();

		// Bagul este de tipul FIFO
		surpriseOne.put(GatherSurprises.gather(10));
		System.out.println(surpriseOne);
		surpriseOne.giveAll();

		for (int i = 0; i < 5; i++) {
			surpriseOne.put(GatherSurprises.gather());
		}
		System.out.println(surpriseOne);
		for (int i = 0; i < 5; i++) {
			surpriseOne.give();
		}

		surpriseTwo.put(GatherSurprises.gather(15));
		System.out.println(surpriseTwo);
		surpriseTwo.giveAll();

		surpriseThree.put(GatherSurprises.gather(5));
		System.out.println(surpriseThree);
		surpriseThree.giveAll();
	}
}
