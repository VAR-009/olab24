package oldshelf;

public class TextBook extends Book {

	// TODO: Make this a final field with most strict visiibility possible.
	private String subject;
	
	// TODO: Change the constructor if required? Correct any errors
	public TextBook(String subject) {
		//no properties/fields for super class book
		this.subject = subject;
	}

	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String sub) {
		this.subject = sub;
	}

	
	@Override
	public final int hashCode(){
		int m = 77;
		int c = 7;
		return m*subject.length() + c;
	}

	@Override
	public final boolean equals(Object o){
		if( o instanceof @SuppressWarnings("unused") TextBook t ){
			return this.hashCode() == o.hashCode();
		}
		return false;
	}
	
	
	@Override
	public final String toString() {
		return "the subject is " + this.subject;
	}


}
