public class AscendingSquareArray {
	public static int[] Squares(int[] numbers)  {

	int counter = 0;
for(int num = 0; num < numbers.length; num++) {
	counter++;
	}

	int[] squares = new int[counter];
for(int num = 0; num < squares.length; num++){
 squares[num] = numbers[num] * numbers[num];

	}

		
for(int index = 0; index < squares.length; index++) {
	for(int count = 0; count.length; count++){
		if(squares[count] < squares[count - 1])
			int checked = squares[count];
			squares[count] = squares[count -1];
			squares[count -1] = checked;
			

		}



}
		return squares;
	}  

}