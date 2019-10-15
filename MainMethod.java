// PuzzleJava.java is the source file and the content inside is called the source code. Note, this class is public, this makes it accessible from another class.
import java.util.Arrays;           							
public class MainMethod {		  							
	public static void main(String[] args){	     			
		PuzzleJava logicClass = new PuzzleJava(); 			// Accessing PuzzleJava class and passing arguments to method/function
		// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
		int[] given = {3,5,1,2,7,9,8,13,25,32};			    
		int number = 10;									
		int[] sumOf = logicClass.sumReturn(given, number);  // passing 2 argument to method/function called sumReturn
		System.out.println(Arrays.toString(sumOf));			

		//Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
		String[] givenStringArray = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		int number = 2;
		String[] passToMethod = logicClass.theNames(givenStringArray, number);
		System.out.println(Arrays.toString(passToMethod));
	
		// Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] passing = logicClass.alphabetManipulation(alphabet);

		//  Generate and return an array with 10 random numbers between 55-100.
		int from = 55;
		int to = 100;
		int arrayRandomValues = 10;
		int[] arrayReturn = logicClass.randomArray(from, to, arrayRandomValues);
		System.out.println(Arrays.toString(arrayReturn));
		

		// Generate and return an array with 10 random nuumbers betweeb 55-100 and have it be sorted(showing the smallest number in the begginning) Display all the numbers in the array. Next, display the minimum vaue tin te array as well as the maximum value.
		int from = 55;
		int to = 100;
		int numberOfValues = 10;
		int[] orderArray = logicClass.retrieve(from,to,numberOfValues);
		System.out.println(Arrays.toString(orderArray));

		// Create a random string that is 5 characters long.
		int characters = 5;
		String passingReturning = logicClass.logicFunction(characters);
		System.out.println(passingReturning);


		// Generate an array with 10 random string that are each 5 characters long.
		int characters = 5;
		int characterLong = 10;
		String[] passingReturning = logicClass.logicFunction(characters,characterLong);
		System.out.println(Arrays.toString(passingReturning));
	
	}
}

