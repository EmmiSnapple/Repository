public class Range {

	public static void main(String[] args) {

		int previous = 0;
		int current = 0;
		int next = 0;

		for (int i = 0; i < args.length; i++) {
			for (int k = 0; k < args.length; k++) {
				if ((args[i]).equals(args[k]) && i != k) {
					System.out.print("error: duplicate");
					System.exit(1);
				}
			}
		}

		for (int i = 0; i < args.length - 1; i++) {
			if (Integer.parseInt(args[i]) > Integer.parseInt(args[i + 1])) {
				System.out.print("error: out of order");
				System.exit(1);;
			}
		}

		for (int i = 0; i < args.length; i++) {
			if (i != 0) {
				previous = Integer.parseInt(args[i - 1]);
			} else {
				System.out.print(args[0]);
			}

			current = Integer.parseInt(args[i]);

			if (i != args.length - 1) {
				next = Integer.parseInt(args[i + 1]);
			}

			if (current == previous + 1 && current == next - 1) {
				// nothing
			} else if (current == previous + 1) {// n is 1 greater than the one before last
				System.out.print("-" + current);
				if (i != args.length - 1) {
					System.out.print(", ");
				}
			} else if (current == next - 1) {// n is 1 less than the one after first
				System.out.print(current);
			} else if (i != 0 ) {
				System.out.print(current);
				if (i != args.length - 1) {
					System.out.print(", ");
				}
			}
		}
	}
}
