// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double pi = 1;
		for(int i = 0;i<num-1;i++){
			if (i % 2 == 0) {
				pi-=((double)1/(3+(2*i)));
			}
			if (i % 2 == 1) {
				pi+=((double)1/(3+(2*i)));
			}
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+pi*4);
	}
}
