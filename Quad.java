class Quad{
	public static void main(String[] args){
        int a=6;
        int b=20;
        int c=3;

		double z=(-b + Math.sqrt ((b*b) - (4 * a * c)))/(2 * a) ;

        System.out.println("The answer found by Yogi's program is:");
		System.out.println("Quad of a b c ="+z);

	}	
}