// Stav Cohen 209024249
// Reouven Nakache 328574652

public class ImageFile extends File { // The son of File class
	
	private int width;
	private int height;
	
	public ImageFile(String name, int bytes, int width, int height) { //full constructor
		super(name, bytes);
		this.width = width;
		this.height = height;
	}
	
	public ImageFile(ImageFile IF1) { //copy constructor
		this(IF1.name, IF1.bytes ,IF1.width, IF1.height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | width = " + width + " | height = " + height ;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImageFile other = (ImageFile) obj;
		return height == other.height && width == other.width;
	}	
	
	
}
