package oops.polymorphism.runTime;

public class Video extends Media{
	
	@Override
    public void play() {
        System.out.println("Video plays with animation");
    }
    public void adjustQuality() {
        System.out.println("Adjusting video quality settings");
    }
}
