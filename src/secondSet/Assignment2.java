package secondSet;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many rows?");
		int rows = scan.nextInt();
		
		System.out.print("How many columns?");
		int columns = scan.nextInt();
	
		int [][] array = new int[rows][columns];
		
		System.out.print("What are the values for this array? ");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<columns; j++ ) {
				array[i][j] = scan.nextInt();
			}
		}
		
		int maxNumber = array[0][0];
		int maxRow = 0;
		int maxColumn =0;
		
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(array[i][j] > maxNumber) {
					maxNumber = array[i][j];
					maxRow = i;
					maxColumn = j;
				}
			}
		}
		
		System.out.println("The maximum number is: " + maxNumber);
		System.out.println("Its position is: (" + maxRow + ", " + maxColumn + ")");

		scan.close();
	}

}


