package intro_to_OOPS;

public class BookRunner {
	public static void main(String[] args) {
		Book book1 = new Book("Art of Computer Programming", 75);
		Book book2 = new Book("Effective Java", 50);
		Book book3 = new Book("Clean Code", 25);
		
		/*book1.setNameOfTheBook("Art of Computer Programming");
		book1.setNoOfCopies(75);
		
		book2.setNameOfTheBook("Effective Java");
		book2.setNoOfCopies(50);
		
		book3.setNameOfTheBook("Clean Code");
		book3.setNoOfCopies(25);*/
		
		book1.bookIntro();
		book2.bookIntro();
		book3.bookIntro();
		
		book1.decreaseNoOfCopies(10);
		book2.increaseNoOfCopies(60);
	}
}
