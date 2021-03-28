package util;

public class Discriminant {
	private int borneInf ;
	private int borneSup ;
	
	private boolean testPlus;
	
	public Discriminant() {
		this.borneInf = 0;
		this.borneSup = 9;
		this.testPlus=false;
	}
	
	public int prob() {
		if(borneSup-borneInf == 1) {
			if (this.testPlus) {
				return this.borneInf;
			}
			else {
				this.testPlus = true;
				return this.borneSup;
			}
		}
		else {
			return (borneSup+borneInf)/2;
		}
		
	}
	
	public void majBI(int nv) {
		this.borneInf = nv;
	}
	
	public void majBS(int nv ) {
		this.borneSup = nv;
	}

}
