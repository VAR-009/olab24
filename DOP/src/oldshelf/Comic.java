package oldshelf;

public class Comic extends Book {

	private String title;
	private final int ageOfMainCharacter;
	

	public Comic(String title, int ageOfMainCharacter) {
		this.title = title;
		this.ageOfMainCharacter = ageOfMainCharacter;
	}
	
	// TODO : create a getter if required.
	public String getTitle() {
		return title;
	}
	public int getAge() {
		return ageOfMainCharacter;
	}

	
	@Override
	public String toString() {
		return "Title is " + this.getTitle() + " Age of main character is " + this.getAge() + "\n";
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
		return Integer.hashCode(ageOfMainCharacter);
	}
	
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
		return hashCode() == o.hashCode();
	}
}
