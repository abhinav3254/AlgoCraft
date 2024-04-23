package dp;

public class FibboNoDp {
	public static void main(String[] args) {
		printFibbo(10);
		System.out.println();
		System.out.println("-----");
		System.out.println("10th index fibbo is :- "+findNIndexFibbo(6));
		System.out.println("done---");
		System.out.println(fib(45));
	}
	
	
	/**
	 * This method is going to print the fibonnaci number till the range
	 * @param range
	 */
	private static void printFibbo(int range) {
		int n = 0;
		int m = 1;
		System.out.print(n+" "+m+" ");
		range = range - 2;
		int count = 0;
		while (count < range) {
			int sum = n+m;
			System.out.print(sum+" ");
			n = m;
			m = sum;
			count++;
		}
	}
	
	/**
	 * This method is for calculating the fibonacci number at an index
	 * @param index is basically the point at which you want the value
	 * @return this return the fibonacci value at that index
	 */
	private static int findNIndexFibbo(int index) {
		if (index == 0) return 0;
		if (index == 1) return 1;
		int n = 0;
		int m = 1;
		int count = 2;
		while (count<index) {
			int sum = n+m;
			n = m;
			m = sum;
			count++;
		}
		return m;
	}
	
	private static int fib(int index) {
		if (index == 0) return 0;
		if (index == 1) return 1;
		return fib(index-1)+fib(index-2);
	}
}
