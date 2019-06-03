package Mai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Print the squares of elements in both diagonals of a matrix");
		System.out.println("-----------------------------------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the row dimension of the matrix");
			int rows = scanner.nextInt();
			System.out.println("Enter the column dimension of the matrix");
			int cols = scanner.nextInt();
			int[][] matrix = new int[rows][cols];
			for(int rowIndex = 0; rowIndex < rows; rowIndex++) {
				for(int colIndex = 0; colIndex < cols; colIndex++) {
					System.out.println("Enter the element");
					matrix[rowIndex][colIndex] = scanner.nextInt();
				}
			}
			System.out.println("The entered matrix is as follows");
			PrintMatrix(matrix);
			System.out.println("Printing the squares of the diagonal elements in the matrix");
			PrintMatrixDiagonalSquares(matrix);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
	
	public static void PrintMatrixDiagonalSquares(int[][] matrix) {
		System.out.println("The first diagonal elements' squares");
		for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for(int colIndex = 0; colIndex < matrix[0].length; colIndex++) {
				if(rowIndex == colIndex) {
					int square = matrix[rowIndex][colIndex] * matrix[rowIndex][colIndex];
					System.out.print(square+" ");
				}
			}
		}
		System.out.println();
		System.out.println("The opposite diagonal elements' squares");
		for(int rowIndex = 0,colIndex = matrix[0].length-1 ; rowIndex < matrix.length && colIndex >=0; rowIndex++, colIndex--) {
			int square = matrix[rowIndex][colIndex] * matrix[rowIndex][colIndex];
			System.out.print(square+" ");
		}
	}
	
	public static void PrintMatrix(int[][] matrix) {
		for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for(int colIndex = 0; colIndex < matrix[0].length; colIndex++) {
				System.out.print(matrix[rowIndex][colIndex]+" ");
			}
			System.out.println();
		}
	}
}
