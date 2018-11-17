package lab1Package;

import java.util.Scanner;
import java.util.Random;

public class AddQuiz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random  r = new Random();
		int n1 = r.nextInt(10);  // random int from 0 to 9
		int n2 = r.nextInt(10);  // random int from 0 to 9
		int sum = n1 + n2;
		//System.out.println("n1="+n1+" n2="+n2+" sum="+sum);
		System.out.print("Try #1...What is "+n1+" + "+n2+"??? ");
		int answer = s.nextInt();
		int attempt = 0;
		while ((sum != answer) && (attempt<2)) {
			System.out.println("Nope...Try again!");
			System.out.print("Try #"+(attempt+2)+" What is "+n1+" + "+n2+"??? ");
			answer = s.nextInt();
			attempt++;
		}
		//System.out.println("attempt="+attempt);
		if (answer == sum) {
			System.out.print("Got it right!!!");
		} else {
			System.out.println("Sorry, you used up 3 attempts!");
		}
		
		
	}

}
