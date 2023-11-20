import java.util.Scanner;
/**
 * The main class of the program that implements the logic for calculating the sum of squares of Luke numbers.
 */
public class Main {
		/**
     * The main method of the program.
     * @param args Command line arguments. The first argument is the number N.
     */
		public static void main(String[] args) {
				int n;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value of N:");
            n = scanner.nextInt();
            scanner.close();
        }
				
				LukeNumber[] lukeNumbers = new LukeNumber[n];
				long sumOfSquares = 0;
		
				for (int i = 1; i <= n; i++) {
							lukeNumbers[i - 1] = new LukeNumber(i);
							sumOfSquares += lukeNumbers[i - 1].getSquare();
					}
			
					System.out.println("The sum of squares of first " + n + " Luke numbers is: " + sumOfSquares);
			
				}
			}