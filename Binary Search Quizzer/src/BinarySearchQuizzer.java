import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BinarySearchQuizzer
	{
		static ArrayList <Integer> temp = new ArrayList <Integer>();
		static int input;
		static int target;
		static int[] array;

		public static void main(String[] args)
			{
				runProgram();
				//keepGoing();
			}
		
		public static void runProgram(){
			input();
			sort();
			FillArray();
			BinarySearch.binarySearch();
			keepGoing();
		}
		
		public static void input(){
			System.out.println("Please input any number within the range from 1 to 20. You can input multiple numbers. End your input with the input of number -1.");
			Scanner userInput = new Scanner(System.in);
			while(input != -1){
				input = userInput.nextInt();
				if (-1<= input && input<=20){
					temp.add(input);
				} else {
					System.out.println("Please input a number between 1 and 20!");
				}
			}
				
			
		}
				
		public static void sort(){
			Collections.sort(temp);
		}
			
		public static void FillArray(){
			array = new int[temp.size()-1];
			for (int i = 0; i < temp.size()-1; i++){
				array[i] = temp.get(i+1);
			}
			System.out.print("Your array looks like: array = {");
			for(int j = 0; j < array.length-1; j++){
				System.out.print(array[j] + ", ");
			}
			System.out.print(array[array.length-1]);
			target = array[(int)(Math.random()*array.length)];
			System.out.println("}. Your target is: " + target + ".");
			System.out.print("                         index: ");
			for(int k = 0; k < array.length-1; k++){
				if (array[k] > 9 ){
					System.out.print(k + " , ");
				} else {
					System.out.print(k + ", ");
				}
				
			}
			System.out.println(temp.size()-2);
//			for (int j = 0; j < array.length; j++){
//				System.out.println(array[j]);
//			}
		}

		public static void keepGoing(){
			System.out.println("Do you want to practice more? (Type \"Yes\" to keep going.)");
			Scanner userInput1 = new Scanner(System.in);
			String readyness = userInput1.nextLine();
			if (readyness.equalsIgnoreCase("Yes")){
				runProgram();
			} else {
				System.out.println("Thanks for using the quizzer. Good bye!");
				 System.exit(0);
			}
			
		}
	}
