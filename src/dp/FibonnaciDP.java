package dp;

import java.util.HashMap;

/**
 * This class will have the implementation of fibonnaci number using Dynamic Programming
 * We are going to use memoization concept
 */
public class FibonnaciDP {
	
	public static void main(String[] args) {
		System.out.println(fibonnaciWithOutDP(40));
		
		HashMap<Integer, Long> map = new HashMap<Integer, Long>();
		System.out.println(fibbonnaciWithDP(50, map));
	}
	
	private static int fibonnaciWithOutDP(int n) {
		if (n<=2) return 1;
		return fibonnaciWithOutDP(n-1)+fibonnaciWithOutDP(n-2);
	}
	
	/**
	 * Applying the DP concept here to make the runtime efficient
	 */
	private static Long fibbonnaciWithDP(int n,HashMap<Integer, Long> map) {
		if (map.containsKey(n)) return map.get(n);
		if (n<=2) return 1l;
		map.put(n, fibbonnaciWithDP(n-1,map)+fibbonnaciWithDP(n-2,map));
		return map.get(n);
	}

}
