package oops.polymorphism.compileTime;




public class MealTrackerMain {

	public static void main(String[] args) {

		MealTracker tracker = new MealTracker();
        tracker.logMeal("Breakfast");
        tracker.logMeal("Lunch", 600);
        tracker.logMeal("Dinner", 800, "40% carbs, 30% protein, 30% fats");
        tracker.logMeal("Snack", 300, "10% carbs, 20% protein, 70% fats", "high fiber", "gluten-free");
	}
}
