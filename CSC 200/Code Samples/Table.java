package lab1Package;

public class Table {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for(x=1;x<=5;x++) {
			for(y=1;y<5;y++) {
				//System.out.print(x+"*"+y+"="+(x*y)+"  ");
				System.out.printf("%2d*%2d=%2d  ",x,y,(x*y));
			}
			System.out.println();
		} // endfor...

	}

}
