import java.util.Scanner;

public class BinarySearch
	{
		static int left;
		static int right;
		static int mid;
		public static void binarySearch(){
			left = 0;
			right = BinarySearchQuizzer.array.length - 1;
			int counter = 1;
			while (left <= right){
				mid = (left + right) / 2;
				int score = 0;			
				System.out.println("pass# " + counter);
				System.out.println("Left: ");
				Scanner userInput = new Scanner(System.in);
				int temp = userInput.nextInt();
				if (temp == left){
					System.out.println("You are right!");
					score ++;
				} else {
					System.out.println("You are wrong. The correct answer is " + left);
				}
				
				System.out.println("Right: ");
				temp = userInput.nextInt();
				if (temp == right){
					System.out.println("You are right!");
					score ++;
				} else {
					System.out.println("You are wrong. The correct answer is " + right);
				}
				
				System.out.println("Mid: ");
				temp = userInput.nextInt();
				if (temp == mid){
					System.out.println("You are right!");
					score ++;
				} else {
					System.out.println("You are wrong. The correct answer is " + mid);
				}
				
				System.out.println("array[mid]: ");
				temp = userInput.nextInt();
				if (temp == BinarySearchQuizzer.array[mid]){
					System.out.println("You are right!");
					score ++;
				} else {
					System.out.println("You are wrong. The correct answer is " + BinarySearchQuizzer.array[mid]);
				}
				System.out.println("You got " + score + "/4.");
				if (BinarySearchQuizzer.target == BinarySearchQuizzer.array[mid]){
					
				}
				if (BinarySearchQuizzer.target < BinarySearchQuizzer.array[mid]){
					right = mid - 1;
				} else {
				    left = mid + 1;
			}
				
				counter ++;
				System.out.println();
				try {Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		}

	}
}
