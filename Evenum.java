import java.util.Scanner; 

class Evenum{
	public static void main(String[] args){
		int sivi;
		
		Scanner in = new Scanner(System.in);  
		        
		System.out.print("sivi = "); sivi = in.nextInt();
                
		for (int i = 1; i <= sivi; i++) {
            if (i % 2 == 0) {
				
				System.out.println("The answer found by Yogi's program is:");   
				System.out.println("Even numbers are :"+i);
		    }
		}
	}
}		    
			                         
