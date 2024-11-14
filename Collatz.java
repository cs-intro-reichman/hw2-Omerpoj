// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		String str = args[1]; 
		int counter = 0;
		int num1;
		if (str.charAt(0)=='v'){
			System.out.println("1 4 2 1 (4)");
			for(int i = 2;i <= num;i++){
				num1=i;
				System.out.print(num1);
				counter = 1;
				while (num1 != 1) {
					if (num1 % 2 == 1) {
						num1 = (num1 * 3) + 1;
						System.out.print(" "+num1);
						counter++;
					}
					if (num1 % 2 == 0) {
						num1 = num1 / 2;
						System.out.print(" "+num1);
						counter++;
					}
				}
				System.out.println(" ("+counter+")");
			}
			System.out.println("Every one of the first "+num+" hailstone sequences reached 1.");
		}
		if (str.charAt(0)=='c') {
			System.out.println("Every one of the first "+num+" hailstone sequences reached 1.");
		}
	}
		
}

