/**
 * Driver class for testing linear programming classes
 */
package linearprogramming;

/**
 * @author Marshall Farrier
 * @version 4/27/11
 */
public class Driver {
	private static void show(double[] arr) {
		if (arr == null) {
			System.out.println("unbounded");
			return;
		}
		int len = arr.length;

		System.out.print("[");
		if (len > 0)
			System.out.print(arr[0]);
		for (int i = 1; i < len; ++i) {
			System.out.print(", " + arr[i]);
		}
		System.out.println("]");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Simplex s;
		double[] x;

		double[][] A;
		double[] b;
		double[] c;

		// Verify book example, CLRS, p. 865
		A = new double[][] { { 1, 1, 3 }, { 2, 2, 5 }, { 4, 1, 2 } };
		b = new double[] { 30, 24, 36 };
		c = new double[] { 3, 1, 2 };
		s = new Simplex(A, b, c);
		x = s.getResult();
		show(x);

		// Problem 29.3-5, p. 878
		A = new double[][] { { 1, 1 }, { 1, 0 }, { 0, 1 } };
		b = new double[] { 20, 12, 16 };
		c = new double[] { 18, 12.5 };
		s = new Simplex(A, b, c);
		x = s.getResult();
		show(x);

		// Problem 29.3-6, p. 879
		A = new double[][] { { 1, -1 }, { 2, 1 } };
		b = new double[] { 1, 2 };
		c = new double[] { 5, -3 };
		s = new Simplex(A, b, c);
		x = s.getResult();
		show(x);

	}

}
