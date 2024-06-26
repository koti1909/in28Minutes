package intro_to_OOPS;

public class Book {
	private String nameOfTheBook;
	private int noOfCopies;
	
	// this is a constructor for Class Book
	Book(String nameOfTheBook, int noOfCopies){
		this.nameOfTheBook = nameOfTheBook;
		this.noOfCopies = noOfCopies;
	}
	
	void setNameOfTheBook(String nameOfTheBook) {
		this.nameOfTheBook = nameOfTheBook;
	}
	
	void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>=0)
			this.noOfCopies = noOfCopies;
		else
			this.noOfCopies = 0;
	}
	
	int getNoOfCopies() {
		return noOfCopies;
	}
	
	void increaseNoOfCopies(int byHowMuch) {
		int newNoOfCopies = noOfCopies + byHowMuch;
		
		this.setNoOfCopies(newNoOfCopies);
		
		this.bookIntro();
	}
	
	void decreaseNoOfCopies(int byHowMuch) {
		int newNoOfCopies = noOfCopies - byHowMuch;
		
		this.setNoOfCopies(newNoOfCopies);
		
		this.bookIntro();
	}
	
	public void bookIntro() {
		System.out.println("Hi, this is " + nameOfTheBook + ". Currently I have " + noOfCopies + " copies of me in stock");
	}
}
