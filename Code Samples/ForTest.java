package lab1Package;

public class ForTest {

	public static void main(String[] args) {
		
		int i = 0; // declared ABOVE the for loop
		for(i=0;i<2;i++) {
			System.out.println("in the loop i is "+i);
		}
		System.out.println("after the loop i is "+i);

		for(int j=0;j<2;j++) {
			System.out.println("in the loop j is "+j);
		}
		//System.out.println("after the loop j is "+j);
		
		System.out.println();
		for(int x = 0; x < 4; x++ ) {
			for(int y = 0; y < 3 ; y++ ) {
				System.out.print("x="+x+",y="+y+"  ");
			}
			System.out.println();
		}
	}

}
