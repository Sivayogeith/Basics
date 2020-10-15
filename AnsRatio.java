public class AnsRatio {
	public static void main(String[] args){
		System.out.println("Ratio.ZERO =" + Ratio.ZERO);
		System.out.println("Ratio.ZERO.value() = " + Ratio.ZERO.value());
		Ratio ans = new Ratio(8, 6);
		System.out.println("Ratio Ans:" + ans);
		System.out.println("Value of Ans:" + ans.value());
		System.out.println("Checking if True or False...");
		System.out.println("Checking ans:" + ans.equals(Ratio.ZERO));
		Ratio ans2 = new Ratio(2,4);
		System.out.println("Ratio Ans:" + ans2);
		System.out.println("Value of Ans" + ans2.value());
		System.out.println("Checking if True or False...");
		System.out.println("Checking ans:" + ans2.equals(Ratio.ZERO));
	}
}