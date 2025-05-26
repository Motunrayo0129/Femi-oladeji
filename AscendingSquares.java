import java.util.Arrays;
public  class AscendingSquares  {
	public static void main (String[] args) {
		
		int firstSquare = 0;
		int secondSquare = 0;
		int thirdSquare = 0;
		int forthSquare = 0;
		int fifthSquare= 0;
		

	int[] numbers = new int[5]; 
		numbers[0] = 9;
		numbers[1] = 2;
		numbers[2] = 7;
		numbers[3] = 0;
		numbers[4] = 5;

			firstSquare = numbers[0] * numbers[0];
			secondSquare = numbers[1] * numbers[1];
			thirdSquare = numbers[2] * numbers[2];
			forthSquare = numbers[3] * numbers[3];
			fifthSquare = numbers[4] * numbers[4];

			int[] squares = new int [5];
				squares[0] = firstSquare;
				squares[1] = secondSquare; 
 				squares[2] = thirdSquare; 
				squares[3] = forthSquare;
				squares[4] = fifthSquare;

				int squares1 = Integer.MAX_VALUE; 
				int squares2 = Integer.MAX_VALUE;
				int squares3 = Integer.MAX_VALUE;
				int squares4 = Integer.MAX_VALUE;
				int squares5 = Integer.MAX_VALUE;

		for(int num = 0; num < squares.length; num++){
			if(squares[num] < squares1){
				squares2 = squares1;	
				squares1 = squares[num]; 
			} 
			else if(numbers[num] < squares2){
				squares3 = squares2;
				squares2 = squares[num];
			}

			else if(numbers[num] < squares3){
				squares4 = squares3;
				squares3 = squares[num];
			}
			else if(numbers[num] < squares4){
				squares5 = squares4;
				squares4 = squares[num];
			}
			else if(numbers[num] < squares5){
				squares5 = squares[num];
			}
				}
System.out.print(squares1 + " " + squares2 + " " + squares3 + " " + squares4 + " " + squares5);
			

		




}
}
