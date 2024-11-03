package Bonus;

public class NewSelection {
	public static String getAgeOrTitle(Object o) {
		switch(o){
			case Comic(String Title,int ageOfMainCharacter) -> {
				return Title;
			}
			case Fiction(String name,FictionType type) -> {
				return name;
			}
			case TextBook(String subject) -> {
				return subject;
			}
			default -> {
				return null;
			}
		}
	}

	public static void main(String[] args) {
		IBook<Integer> com1 = new Comic("Ironman", 35);
        IBook<Integer> com2 = new Comic(" The Batman", 35);
        IBook<FictionType> fic1 = new Fiction("Superman", FictionType.Tragedy);
        IBook<FictionType> fic2 = new Fiction("Wonder Woman", FictionType.Tragedy);
        IBook<String> tb1 = new TextBook("OOPS");
        IBook<String> tb2 = new TextBook("CP");


        System.out.println("com1 vs com2: " + com1.compareTo(com2)); 
        System.out.println("fic1 vs fic2: " + fic1.compareTo(fic2));
        System.out.println("tb1 vs tb2: " + tb1.compareTo(tb2));
	}
}