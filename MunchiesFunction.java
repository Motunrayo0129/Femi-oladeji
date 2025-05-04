public class MunchiesFunction   {
 public static int Multiples(int number) {
		return number * 5; 
		}
public static boolean Prime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) { 
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

public static int SumOfNum(int number)  {
	int sum = 0;
for(int num = 1; num <= number; num++)  {
	sum += num;   }
	return sum;
		}

}
