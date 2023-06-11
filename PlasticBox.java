// Stav Cohen 209024249
// Reouven Nakache 328574652

package q02;

public class PlasticBox extends Box { // The son of Box class
	private boolean liquidProof;
	
	public PlasticBox(int serialNum, float volume, boolean liquidProof) { //full constructor
		super(serialNum, volume);
		this.liquidProof = liquidProof;
	}

	public boolean isLiquidProof() {
		return liquidProof;
	}

	@Override
	public boolean getRecyclable() {
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " | PlasticBox liquidProof = " + liquidProof;
	}
	
}
