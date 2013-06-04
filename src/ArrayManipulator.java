
public class ArrayManipulator {

	public int largestOfArray(int[] numbers) {

		int largest = 0;
		if(numbers.length==0){

			throw new IllegalArgumentException("No Intergers to compare");

		}else{

			largest = numbers[0];

			for(int i=0; i<numbers.length;i++){

				if(numbers[i]>largest){

					largest = numbers[i];

				}

			}

		}
		return largest;
	}

}
