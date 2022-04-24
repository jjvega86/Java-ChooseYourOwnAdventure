import java.util.Scanner;
import java.util.Random;

public class Helpers {
	
	public static String TakeInput(String input){
		System.out.println(input);
		Scanner sc = new Scanner(System.in);
		String response = sc.nextLine();
		return response;
		
	}
	
	public static void Print(String input) {
		System.out.println(input);
	}
	
	public static int GenerateRandomInteger(int max) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(max);
		return randomNumber;
	}
	
	public static int ConvertStringToInt(String s) {
		int convertedValue;
		try {
			convertedValue = Integer.parseInt(s);
			
		} catch(NumberFormatException e) {
			convertedValue = 0;
			
		}
		return convertedValue;
	}
	
	

}
