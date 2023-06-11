package q02;

import java.util.Objects;

public abstract class Box { // //Parent class of Boxes
	private static int count1=1;
	private static int count2=1;
	protected int serialNum;
	protected float volume;
	
	
	public Box(int serialNum, float volume) { //full constructor
		this.serialNum = serialNum;
		this.volume = volume;
		if( this instanceof CardBox)
			serialNum = ++count1;
		if( this instanceof PlasticBox)
			serialNum = ++count2;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public float getVolume() {
		return volume;
	}
		
	public static int getTheSN1() {
		return count1;
	}
	
	public static int getTheSN2() {
		return count2;
	}
	
	public abstract boolean getRecyclable();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		return serialNum == other.serialNum;
	}

	@Override
	public String toString() { 
		if( this instanceof CardBox)
			this.serialNum = serialNum*10 +1;
		if( this instanceof PlasticBox)
			this.serialNum = serialNum*10 +2;
		
		return "Box serialNum = " + serialNum + " | volume = " + volume;
	}

	
	
	
	
}
