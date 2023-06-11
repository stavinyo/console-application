package q02;

public class CardBox extends Box { // The son of Box class
	private int maxGrams;
	
	public CardBox(int serialNum, float volume, int maxGrams) { //full constructor
		super(serialNum, volume);
		this.maxGrams = maxGrams;
	}

	public int getMaxGrams() {
		return maxGrams;
	}

	@Override
	public boolean getRecyclable() {
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " | CardBox maxGrams = " + maxGrams;
	}
	
}
