package rotate;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);

		// Enter array values
		int[][] m = new int[3][4];
		System.out.println("Enter " + m.length + " rows and "
				+ m[0].length + " columns: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = input.nextInt();
			}
		}

		// Display matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}

		// Tilt 90 clockwise
		int[][] result = tilt(m);

		// Display result
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] tilt(int[][] m) {
		int[][] n = new int[4][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				n[j][m.length-1-i] = m[i][j];
			}
		}
		return n;		
	}

}