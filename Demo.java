public class Demo {
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