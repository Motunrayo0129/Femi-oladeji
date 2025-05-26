public class AscendingSquareArray {
public static int[] Squares(int[] numbers)  {
	int[] squares = new int[numbers.length];

for(int num = 0; num < numbers.length; num++){
 squares[num] = numbers[num] * numbers[num];

	}

		
for(int index = 0; index < squares.length - 1; index++) {
	for(int count = 0; count < squares.length - index -1; count++){
		if(squares[count] > squares[count + 1]){
			int checked = squares[count];
			squares[count] = squares[count + 1];
			squares[count + 1] = checked;
			}

		}



}
		return squares;
	}  

}