package lab1Package;

import java.util.Scanner;
import java.util.Random;

public class SubQuiz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random  r = new Random();
		int count = 1;
		int correct = 0;
		while (count <= 5) {
			int n1 = r.nextInt(10);  // random int from 0 to 9
			int n2 = r.nextInt(10);  // random int from 0 to 9
			if (n1 < n2) {
				int tmp = n2;
				n2 = n1;
				n1 = tmp;
			}  // endif...
			int difference = n1 - n2;
			System.out.println("Question #"+count+" What is "+n1+" - "+n2+"???");
			int answer = s.nextInt();
			if (answer == difference) {
				System.out.println("Correct!!!");
				correct++;
			} else {
				System.out.println("boo!");
			} // endif...
			count++;
		} // endwhile...
		System.out.println("You got "+correct+" out of 5 answers correct!!!");
	} // end main...
} // end class...
