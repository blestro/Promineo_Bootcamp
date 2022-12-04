package week3;

public class ArrayMethodsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		System.out.println("Step 1");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		subFirstLast(ages[0], ages[ages.length - 1]);
		
		//add new age to array
		// Add a new element to the end of an array? Do you mean List?
		ages[7] = 2;
		
		subFirstLast(ages[0], ages[ages.length - 1]);
		
		// loop to calculate average of the numbers in the array
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum+=ages[i];
		}
		System.out.println("The average of ages: " + sum/ages.length);
		
		//2
		System.out.println("\nStep 2");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sum2 = 0;
		// loop to get average of names
		for (int i = 0; i < names.length; i++) {
			sum2 = sum2 + names[i].length();
		}
		System.out.println("The average number of letters per name: " + sum2/names.length);
		
		String allNames = "";
		// loop for adding all names into string separated by a space.
		for (int i = 0; i < names.length; i++) {
			allNames = allNames + names[i] + " ";
		}
		System.out.println("All the names together: " + allNames);
		
		//3
		System.out.println("\nStep 3");
		// Accessing last element of an array
		System.out.println("Last element of array ages: " + ages[ages.length - 1]);
		
		//4
		System.out.println("\nStep 4");
		// Accessing first element of an array
		System.out.println("First element of array ages: " + ages[0]);
		
		//5
		System.out.println("\nStep 5");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println(nameLengths[i]);
		}
		
		//6
		System.out.println("\nStep 6");
		int sum_name_lengths = 0;
		for (int nameLength : nameLengths) {
			sum_name_lengths+=nameLength;
		}
		System.out.println("Sum of all name lengths in nameLength: " + sum_name_lengths);
		
		//7
		System.out.println("\nStep 7");
		String words_multi = multiplyWord("Name", 4);
		System.out.println(words_multi);
		
		//8
		System.out.println("\nStep 8");
		String firstname = fullName("Arleth", "Rivera");
		System.out.println(firstname);
		
		//9
		System.out.println("\nStep 9");
		int[] numbers5 = {3, 9, 23, 64, 2};
		System.out.println(greaterThanHundred(numbers5));
		
		int[] numbers4 = {9, 23, 64, 2};
		System.out.println(greaterThanHundred(numbers4));
		
		//10
		System.out.println("\nStep 10");
		double[] numbers3 = {23.5, 64.2, 10.1};
		System.out.println("Avg: " + avgDoubles(numbers3));
		
		double[] numbers6 = {23.5, 64.2, 10.1, 4.7, 12.6, 2.1};
		System.out.println("Avg: " + avgDoubles(numbers6));
		
		//11
		System.out.println("\nStep 11");
		// re-used past array doubles
		System.out.println(greaterArrayDouble(numbers3, numbers6));
		System.out.println(greaterArrayDouble(numbers6, numbers3));
		
		//12
		System.out.println("\nStep 12");
		boolean isHotOutside = true;
		double money = 12.40;
		System.out.println("Will I buy a drink when isHotOutside : " + isHotOutside + " and money is " + money + " Result:\n" + willBuyDrink(isHotOutside, 12.40));
		
		//13
		System.out.println("\nStep 13");
		double paid = 123.65;
		System.out.println("The calculated tip(18%) for " + paid + " is " + calcTip(123.65));
		
	}
	
	// added function for subtracting first and last element from the array
	public static void subFirstLast(int first, int last) {
		int diff = first - last;
		System.out.println("The difference between " + first + " and " + last + " is " + diff);
	}
	
	//7 
	public static String multiplyWord(String word, int n) {
		String word_multiplied = "";
		for (int i = 1; i <= n; i++) {
			word_multiplied+=word;
		}
		return word_multiplied;
	}
	
	//8
	public static String fullName(String firstName, String lastName) {
		String fullname = firstName.concat(" " + lastName);
		return fullname;
	}
	//9 
	public static boolean greaterThanHundred(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
		if (sum > 100) {
			return true;
		} else {
			return false;
		}	
	}
	//10
	public static double avgDoubles(double[] nums) {
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
		return sum/nums.length;
	}
	//11
	public static boolean greaterArrayDouble(double[] one, double[] two) {
		double sum1 = 0;
		for (int i = 0; i < one.length; i++) {
			sum1+=one[i];
		}
		double avg1 = sum1/one.length;
		System.out.println(avg1);
		
		double sum2 = 0;
		for (int i = 0; i < two.length; i++) {
			sum2+=two[i];
		}
		double avg2 = sum2/two.length;
		System.out.println(avg2);
		
		if ( avg1 > avg2) {
			return true;
		}
		else {
			return false;
		}
	}
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}		
	}
	//13
	public static double calcTip(double paid) {
		double tip = paid*.18;
		return tip;	
	}

}
