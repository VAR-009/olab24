package newshelf;

import oldshelf.FictionType;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if( o instanceof Fiction f ){
			return f.name();
		}
		if( o instanceof TextBook t){
			return t.subject();
		}
		if (o instanceof Comic c) {
			return c.title();
		}
		
		return "";
	}

	public static void main(String[] args) {
		
		TextBook t = new TextBook("OOPS");
		System.out.println(NewSelection.getAgeOrTitle(t));

		Comic c = new Comic("Thor",260);
		System.out.println(NewSelection.getAgeOrTitle(c));
		
		Fiction f = new Fiction("Batman",FictionType.Tragedy);
		System.out.println(NewSelection.getAgeOrTitle(f));		
	}
}
