import java.util.Scanner;
import java.util.Random;

public class Challenge346 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.print("enter the number of dice to roll and the number of sides (like 3d6 says roll 3 six sided dice):  ");
		Scanner s = new Scanner(System.in);
		//String inString = s.next().toLowerCase();
		//String[] splitString = inString.split("d");
		String[] splitString = s.next().toLowerCase().split("d");
		int n = Integer.parseInt(splitString[0]);
		int sides = Integer.parseInt(splitString[1]);
		System.out.println("you asked us to roll "+n+" dice, each with "+sides+" sides");
		for(int i=0;i<n;i++) {
			int roll = r.nextInt(sides)+1;
			System.out.println("   roll #"+(i+1)+" = "+roll);
		} // endfor...
	} // endmain...
} // endclass