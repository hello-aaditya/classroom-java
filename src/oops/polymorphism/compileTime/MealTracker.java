/*
Subtask 1: Basic Meal Logging
Introduction: Implement basic logging functionalities for different meal types using method overloading to handle variations in meal data.

Objective: Create methods to log meals by type, type with calorie count, and type with calorie count and macronutrients.

Instructions:

	1. Define a MealTracker class.

	2. Implement an overloaded method logMeal that accepts different parameters:

			logMeal(String mealType)
			logMeal(String mealType, int calories)
			logMeal(String mealType, int calories, String macros)

	3. In the main method, create an instance of MealTracker (reference tracker) and use it to log different meals:

		Log a "Breakfast" with no additional data.
		Log a "Lunch" specifying 600 calories.
		Log a "Dinner" specifying 800 calories and "40% carbs, 30% protein, 30% fats".
		
Subtask 2: Advanced Meal Logging with Detailed Nutritional Information
Objective: Enhance the meal logging system to include detailed parameters such as micronutrients and dietary restrictions, demonstrating advanced uses of method overloading.

Instructions:

	1. Extend the MealTracker class with additional overloaded method to include more parameters:

	2. logMeal(String mealType, int calories, String macros, String micronutrients, String dietaryRestrictions) for logging meals with both micronutrient details and dietary restrictions.
	3. Use the method in the main method to log meals with detailed nutritional and dietary information:

		- Log a "Snack" specifying 300 calories, "10% carbs, 20% protein, 70% fats", "high fiber", and "gluten-free".

*/
package oops.polymorphism.compileTime;




public class MealTracker {
	
    public void logMeal(String mealType) {
        System.out.println("Meal logged: " + mealType);
    }

    public void logMeal(String mealType, int calories) {
        System.out.println("Meal logged: " + mealType + " with " + calories + " calories");
    }

    public void logMeal(String mealType, int calories, String macros) {
        System.out.println("Meal logged: " + mealType + " with " + calories + " calories, macros: " + macros);
    }

    public void logMeal(String mealType, int calories, String macros, String micronutrients, String dietaryRestrictions) {
        System.out.println("Meal logged: " + mealType + " with " + calories + " calories, macros: " + macros + ", micronutrients: " + micronutrients + ", dietary restrictions: " + dietaryRestrictions);
    }

}
