public class Ratio {
	protected int numer;
	protected int demer;
	public static final Ratio ZERO = new Ratio();

	private Ratio () {
		this (4,9);
	}

 	public Ratio (int numer,int demer) {
 		this.numer = numer;
 		this.demer = demer;
 	}

 	public boolean equals(Object su){
 		if (su==this) {
 			return true;
 		}else if (!(su instanceof Ratio)) {
 			return false;	
 		}
 		
 		Ratio that = (Ratio)su; 
 		return (this.numer*that.demer == that.numer*this.demer);
 	}
 		
 	public int getNumer()	{
 		return numer;
 	}

 	public int getDemer() {
 		return demer;
 	}

 	public String toString() {
 		return String.format("%d/%d", numer, demer);
 	}
 	public double value() {
 		return (double)numer/demer;
 	}
}
