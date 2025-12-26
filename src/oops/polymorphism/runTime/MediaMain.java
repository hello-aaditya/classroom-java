package oops.polymorphism.runTime;



public class MediaMain {

	public static void main(String[] args) {
		// Subtask 2: Instantiate Video and Photo with Media reference
        Media mediaVideo = new Video();
        Media mediaPhoto = new Photo();
        
        // Call overridden play() method using Media reference
        System.out.println("--- Calling play() method ---");
        mediaVideo.play();
        mediaPhoto.play();
        
        // Call displayInfo() method
        System.out.println("\n--- Calling displayInfo() method ---");
        mediaVideo.displayInfo();
        mediaPhoto.displayInfo();
        
        // Downcasting to access subclass-specific methods
        System.out.println("\n--- Downcasting to access subclass-specific methods ---");
        if (mediaVideo instanceof Video) {
            ((Video) mediaVideo).adjustQuality();
        }
        
        if (mediaPhoto instanceof Photo) {
            ((Photo) mediaPhoto).applyFilter();
        }

	}

}
