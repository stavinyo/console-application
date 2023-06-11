// Stav Cohen 209024249
// Reouven Nakache 328574652


import java.util.Objects;

public class File { //Parent class of Files

	protected String name;
	protected int bytes;
	
	public File(String name, int bytes) { //full constructor
		super();
		this.name = name;
		this.bytes = bytes;
	}
	
	public File(File F1) { //copy constructor
		this(F1.name, F1.bytes);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBytes() {
		return bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	@Override
	public String toString() {
		if( this instanceof ImageFile)
			this.name = name + ".jpg";
		if( this instanceof VideoFile)
			this.name = name + ".mp4";
		
		return "File name = " + name  + " | bytes = " + bytes;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		return bytes == other.bytes && Objects.equals(name, other.name);
	}
	
	
}
