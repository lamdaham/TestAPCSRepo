import java.util.Random;

public class Demo {


	public static String arrToString(int[]arr) {
		String output = "{";
 		for (int i = 0; i<arr.length; i++) {
    		output+= arr[i];
    		if (i<arr.length-1) {
      			output += ", ";
    		}
  		}
  		output += "}";
  		return output;
	}


	public static String arrayDeepToString(int[][]arr) {
		String output = "{";
		for (int i = 0; i<=arr.length-2; i++) {
			output += arrToString(arr[i]);
			output += ", ";
		}
		output += arrToString(arr[arr.length-1])+"}";
		return output;
	}

	public static int[][] create2DArray(int rows, int cols, int maxValue) {
		int[][] output = new int[rows][cols];
		Random random = new Random();
		for (int r = 0; r<rows; r++) {
			for (int c = 0; c<cols; c++) {
				output[r][c] = random.nextInt(maxValue);
			}
		}
		return output;
	}


	public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
		Random random = new Random();
		int[][] output = new int[rows][];
		for (int r = 0; r <rows; r++) {
			output[r] = new int[random.nextInt(cols)];
			for (int c = 0; c < output[r].length; c++) {
				output[r][c] = random.nextInt(maxValue);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int input = 0;
		if (args.length == 0) {
			input = 5;
		} else {
			input = Integer.parseInt(args[0]);
	}
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j<=input-i+1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}