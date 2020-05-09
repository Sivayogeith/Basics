import java.util.Scanner; 

public class OistoTV2 {
	public static void main (String[] args){
		int x;
		int yogi;
		Scanner in = new Scanner(System.in);  
		Scanner out = new Scanner(System.in);  

		System.out.print("x = "); x = in.nextInt();
		System.out.print("yogi = "); yogi = in.nextInt();
		
		double z = x*yogi;

		System.out.println("1 is to " + yogi + " of " + x + " = " + z);
	}
}