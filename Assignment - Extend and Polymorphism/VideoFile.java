public class VideoFile extends File { // The son of File class
	private boolean hasTranslation;

	public VideoFile(String name, int bytes, boolean hasTranslation) { //full constructor
		super(name, bytes);
		this.hasTranslation = hasTranslation;
	}
	
	public VideoFile(VideoFile VF1) { // copy constructor
		this(VF1.name, VF1.bytes, VF1.hasTranslation);
	}

	public boolean isHasTranslation() {
		return hasTranslation;
	}

	public void setHasTranslation(boolean hasTranslation) {
		this.hasTranslation = hasTranslation;
	}

	@Override
	public String toString() {
		return super.toString() + " | hasTranslation = " + hasTranslation;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoFile other = (VideoFile) obj;
		return hasTranslation == other.hasTranslation;
	}

}
