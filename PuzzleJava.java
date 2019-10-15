// PuzzleJava.java is the source file and the content inside is called the source code. Note, this class is public, this makes it accessible from another class.
import java.util.Arrays;                   // Arrays class in java.util package, collection framework. Provides access to dynamically create and accesdd java array.  
import java.util.Collections;			   // Class that consist of static methods that operate on or return collections. Use to collect and shuffle an ArrayList
import java.util.Random;				   //  An instance of this class is used to generate a stream of pseudorom numbers. Used in conjuction with collections.
import java.util.ArrayList;				   // This module provides us the ability to create a modifiable array, there are some slight changes in how you interact with it.
public class PuzzleJava {				   // PuzzleJava is a class, Java loves OOP. It is imortant that your file namem is exactly the same as your class name.
	//Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
	public static int[] sumReturn(int[] arr1, int number){           // Method/function named sumReturn of Int[] type with 2 paramenters int[] and int, this method is accessed from the MainMethod class.
		ArrayList<Integer> arrayGreater = new ArrayList<Integer>();  // in order to create and modify an array a util module provides us with an ArrayList.
		int sum = 0;
		int initialization1 = 0;
		for(int x = 0; x < arr1.length; x++){						 // int[] arr1 interation using a for loop
			sum += arr1[x];											 // while iterating we add all array values and store in int variable named sum.
			if (arr1[x] > number){									 // while iterating we search for values bigger than number. 
				arrayGreater.add(arr1[x]);							 // when value is bigger than number its added to ArrayList<Integer> named arrayGreater.
				initialization1++;									 // Keeping track of how many numbers found, to create a int[] in order to return array
			}
		}
		int[] myArray;												
		myArray = new int[initialization1];							 // We can't return an ArrayList<Integer> so we have to covert to int[]. Here we use varible initialization1 as the initialization for the int[]
		for(int y = 0; y < arrayGreater.size(); y++){				 // ArrayList<Integer> arrayGreater interation and creating a duplicate as a int[]						 
			myArray[y] = arrayGreater.get(y);
		} 
		System.out.println(sum);									 // Is the bit of code that enabled us to output something to our command prompt or terminal. equivalent to javascrip console.log()
		return myArray;
	}

	// Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
	public String[] theNames(String[] names,  int number){
		ArrayList<String> newList = new ArrayList<String>();
		ArrayList<String> moreThan = new ArrayList<String>();
		int initialization = 0;
		for(int x = 0; x < names.length; x++){
			newList.add(names[x]);
			if(names[x].length() >= number){
				moreThan.add(names[x]);
				initialization++;
			}
		}
		Collections.shuffle(newList);
		for(int y = 0; y < newList.size(); y++){
			System.out.println(newList.get(y));
		}
		String[] myArray;
		myArray = new String[initialization];  
		for(int y = 0; y < moreThan.size(); y++){
			if(moreThan.get(y).length() >= number){
				myArray[y] = moreThan.get(y);
			}
		}
		return myArray;
	}


	// Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
	public static String[] alphabetManipulation(String[] bareAlphabet){
		ArrayList<String> transformed = new ArrayList<String>();
		for(int a = 0; a < bareAlphabet.length; a++){
			transformed.add(bareAlphabet[a]);
		}
		Collections.shuffle(transformed);
		if(transformed.get(0) == "a" || transformed.get(0) == "e" || transformed.get(0) == "i" || transformed.get(0) == "o" || transformed.get(0) == "u"){
			System.out.println("First letter is a vowel");
		}else{
			System.out.println("First letter " + transformed.get(0));
		}
		System.out.println("Ending letter " + transformed.get(25));
		System.out.println(transformed);
		return null;
	}

	//  Generate and return an array with 10 random numbers between 55-100.
	public static int[] randomArray(int from, int to, int numberValues){
		ArrayList<Integer> createdArray = new ArrayList<Integer>();
		Random r = new Random();
		int keepTrackLength = 0;
		int i = 1;
		while(i <= numberValues){
			createdArray.add(r.nextInt(to-from)+from);
			keepTrackLength++;
			i++;

		}
		int[] toIntArray;
		toIntArray = new int[keepTrackLength];    
		for(int x = 0; x < createdArray.size(); x++){
			toIntArray[x] = createdArray.get(x);
		}
		return toIntArray;

	}

	// Generate and return an array with 10 random nuumbers betweeb 55-100 and have it be sorted(showing the smallest number in the begginning) Display all the numbers in the array. Next, display the minimum vaue tin te array as well as the maximum value.
	public static int[] retrieve(int from, int to, int numberOfValues){
		ArrayList<Integer> arrayCreated = new ArrayList<Integer>();
		Random r = new Random();
		int i = 1;
		while(i <= numberOfValues){
			arrayCreated.add(r.nextInt(to-from)+from);
			i++;
		}
		int whileIncrement = 0;
		int compare = 0;
		int temp = 0;
		int[] myArray = new int[10];
		while(whileIncrement < arrayCreated.size()){
			for(int y = whileIncrement; y < arrayCreated.size(); y++){
				if(arrayCreated.get(whileIncrement) > arrayCreated.get(y)){
					temp = arrayCreated.get(whileIncrement);
					arrayCreated.set(whileIncrement, arrayCreated.get(y));
					arrayCreated.set(y, temp);
				}
			myArray[whileIncrement] = arrayCreated.get(whileIncrement);
			}
			whileIncrement++;
		}
		System.out.println("min " + arrayCreated.get(0) + " max " + arrayCreated.get(9));
		return myArray;
	}

	// Create a random string that is 5 characters long.
	public static String logicFunction(int characters){
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	 	String randomString = "";
	 	Random r = new Random();
	 	for(int x = 0; x < characters; x++){
	 		int generatedNum = r.nextInt(alphabet.length);
	 		randomString += alphabet[generatedNum];
	 	}
	 	return randomString;
	 } 

	// Generate an aray with 10 random strings that are each 5 characters long;
	public static String[] logicFunction(int characters,int characterLong){
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	 	String randomString = "";
	 	String[] createdArray = new String[characterLong];
	 	Random r = new Random();
	 	int i = 0;
	 	while(i < characterLong){
	 		for(int x = 0; x < characters; x++){
	 			int generatedNum = r.nextInt(alphabet.length);
	 			randomString += alphabet[generatedNum];
	 		}
			createdArray[i] = randomString;
	 		randomString = "";	 		
	 		i++;
	 	}
	 	return createdArray;
	 } 

} 



























