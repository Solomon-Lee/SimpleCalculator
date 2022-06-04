import java.util.Scanner;

/*
 * This program will create a simple calculator with 4 operations: multiplications, addition, subtraciton, and division
 */
 
 public class calculator {
	 public static void main(String[] args) {
		 char operator;
		 double num1, num2;
		 Scanner input = new Scanner(System.in);
		 boolean finished = false;
		 
		 while (!finished) {
		 System.out.print("Enter the Operator ( +, -, *, /) or q to quit: ");
		 operator = input.next().charAt(0);
		 System.out.println();
		 if (operator != 'q') {
			 System.out.print("Enter the first number: ");
			 num1 = input.nextDouble();
			 System.out.println();
			 
			 System.out.print("Enter the second number: ");
			 num2 = input.nextDouble();
			 System.out.println();
					 
			 switch(operator) {
				 case '+':
					System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
					break;
					
				case '-':
					System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
					break;
					
				case '/':
					if (num2 != 0)
						System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
					else 
						System.out.println("The second number is equal to zero, thus the result is undefined");
					break;
					
				case '*':
					System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
					break;
				
				default:
					System.out.printf("%c is not a useable operator for this calculator", operator);
				}
			System.out.println();
		} else 
			finished = true;
		
		}
	
		System.out.println("Thanks for using this calculator. Until next time bye!");
		
		input.close();	
		
	 }
 }
 
