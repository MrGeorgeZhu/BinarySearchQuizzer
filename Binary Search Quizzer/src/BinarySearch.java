
public class BinarySearch
	{
		static int left;
		static int right;
		static int mid;
		public static void binarySearch(){
			left = 0;
			right = BinarySearchQuizzer.array.length - 1;
			while (left <= right){
				mid = (left + right) / 2;
				if (BinarySearchQuizzer.target == BinarySearchQuizzer.array[mid]){
					
				}
				if (BinarySearchQuizzer.target < BinarySearchQuizzer.array[mid]){
					right = mid - 1;
				} else {
				left = mid + 1;
			}
		}

	}
}
