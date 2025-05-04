import java.util.Scanner;
public class SundayMunchie {
	public static void main(String[] args)  {

Scanner input = new Scanner(System.in);
System.out.println("Multiples of 5");
System.out.print("Enter a number: ");
	int number = input.nextInt();
System.out.println(MunchiesFunction.Multiples(number));

System.out.println("prime numbers from 1 to 50");
	for(int num = 2; num <= 50; num++) {
		if(MunchiesFunction.Prime(num)) {
		System.out.print(num + " "); }
			}
	
System.out.println("Sum of natural four number");
	int number = 4;
	int sum = (MunchiesFunction.SumOfNum(number));
System.out.println("The sum of the four natural number is" + num);
		 




}