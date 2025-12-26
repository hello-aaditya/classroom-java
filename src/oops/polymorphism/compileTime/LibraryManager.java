/*Subtask 1: Basic Book Interaction Logging

Define a LibraryManager class.
Implement an overloaded method recordInteraction that accepts different parameters:
	recordInteraction(String interactionType)
	recordInteraction(String interactionType, String date)
	recordInteraction(String interactionType, String date, int memberID)
In the main method, create an instance of LibraryManager and log:
	A "Check Availability" interaction with no additional data
	A "Borrow" interaction with date "2023-07-25"
	A "Return" interaction with date "2023-08-01" and member ID 102
	
Subtask 2: Advanced Book Interaction Logging with Detailed Information
Extend the LibraryManager class with additional overloaded methods:
	recordInteraction(String interactionType, String date, int memberID, String condition)
	recordInteraction(String interactionType, String date, int memberID, String condition, String notes)
In the main method, log a "Renew" interaction with date "2023-07-30", member ID 205, condition "Good", and notes "Extended for 30 days"
*/

package oops.polymorphism.compileTime;
public class LibraryManager {

public void recordInteraction(String interactionType) {
    System.out.println("Interaction recorded: " + interactionType);
}

public void recordInteraction(String interactionType, String date) {
    System.out.println("Interaction recorded: " + interactionType + " on " + date);
}

public void recordInteraction(String interactionType, String date, int memberID) {
    System.out.println("Interaction recorded: " + interactionType + " on " + date + ", member ID: " + memberID);
}

public void recordInteraction(String interactionType, String date, int memberID, String condition) {
    System.out.println("Interaction recorded: " + interactionType + " on " + date + ", member ID: " + memberID + ", condition: " + condition);
}

public void recordInteraction(String interactionType, String date, int memberID, String condition, String notes) {
    System.out.println("Interaction recorded: " + interactionType + " on " + date + ", member ID: " + memberID + ", condition: " + condition + ", notes: " + notes);
}
}
