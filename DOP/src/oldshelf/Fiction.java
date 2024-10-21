package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/ private final String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private static FictionType type;
	public Fiction(String name, FictionType ft) {
		this.name = name;
		this.type = ft;
		// TODO  correct the above.
	}

	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}


}
