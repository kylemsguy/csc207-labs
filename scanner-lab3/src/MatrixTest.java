import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class MatrixTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// open file to read
			String filename;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the name of the input file");
			filename = in.nextLine();
			FileInputStream fstream = new FileInputStream(filename);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					fstream));

			int rows = 3;
			int cols = 4;
			double[][] Matrix = new double[rows][cols];

			String input;

			while ((input = br.readLine()) != null) {
				System.out.print("\nThe line is:" + input);
				String allNumbers[] = input.split(" ");
				int col = 0;
				int row = 0;
				for (String singleNumber : allNumbers) {
					Matrix[row][col] = Integer.parseInt(singleNumber);
					col = col + 1;
				}
				row = row + 1;

			}
			System.out.println();
			double total = 0.0;
			for (int j = 0; j < Matrix.length; j++) {
				for (int k = 0; k < Matrix[0].length; k++) {
					total = total + Matrix[j][k];
				}
			}
			double average = total / (rows * cols);
			System.out
					.println("The sum of all of the elements in this matrix is: "
							+ total);
			System.out.println("The average of this matrix is: " + average);
			fstream.close();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

}
