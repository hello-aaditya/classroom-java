package oops.polymorphism.compileTime;


public class LibraryManagerMain {

	public static void main(String[] args) {
		
		LibraryManager manager = new LibraryManager();
        manager.recordInteraction("Check Availability");
        manager.recordInteraction("Borrow", "2023-07-25");
        manager.recordInteraction("Return", "2023-08-01", 102);
        manager.recordInteraction("Renew", "2023-07-30", 205, "Good", "Extended for 30 days");

	}

}
