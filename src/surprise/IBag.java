package surprise;

public interface IBag {
	// adds a surprise in the bag
	public void put(ISurprise newSurprise);

	// adds all the surprises from another IBag
	// -> the 'bagOfSurprises' will be empty() afterwards
	public void put(IBag bagOfSurprises);

	// removes a surprise from the bag and returns it
	public ISurprise takeOut();

	// Checks if the bag is empty or not
	public boolean isEmpty();

	// Returns the number of surprises
	public int size();

	// Returns a ISurprise object from bag
	ISurprise takeObject();

}
