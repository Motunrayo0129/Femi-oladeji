import java.util.Arrays;
import java.util.Scanner;

public class AscendingSquaresArray2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("How many number you wish to enter: ");
	int size = input.nextInt();
	
	
	int[] ascendingOrder = new int[size];



 
for(int count = 0; count < ascendingOrder.length; count++) {
	System.out.print("Enter a number: ");
		int numbers = input.nextInt();
	ascendingOrder[count] = numbers;
	
}
	System.out.println(Array.toString(AscendingSquareArray.Squares(ascendingOrder) + " are in ascending orders"));



}
		}

