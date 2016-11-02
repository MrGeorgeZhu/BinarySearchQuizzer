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
				input();
				sort();
				FillArray();
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
			System.out.print("Your array looks like: array = {");
			for(int i = 1; i < temp.size()-1; i++){
				System.out.print(temp.get(i) + ", ");
			}
			System.out.print(temp.get(temp.size()-1));
			target = temp.get((int)(Math.random()*temp.size())+1);
			System.out.print("}. Your target is: " + target + ".");			
		}
			
		public static void FillArray(){
			int[] array = new int[temp.size()-1];
			for (int i = 0; i < temp.size()-1; i++){
				array[i] = temp.get(i+1);
			}
//			for (int j = 0; j < array.length; j++){
//				System.out.println(array[j]);
//			}
		}

		public static void answers(){
			
		}
	}
