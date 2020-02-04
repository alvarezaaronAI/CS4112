package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		System.out.print("Enter R and N : ");
		Scanner sc = new Scanner(System.in);
		String inputUser;
		inputUser = sc.nextLine();
		//"2 2" 
		generateRCombinates(inputUser);
		
	}
	public static void generateRCombinates(String userInput) {
		String[] instructions = userInput.split(" ");
		int r = Integer.parseInt(instructions[0]);
		int n = Integer.parseInt(instructions[1]);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(instructions));
		
	}
}
