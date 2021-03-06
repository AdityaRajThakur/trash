/*Author Adityaraj*/

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class kanpsack01 {
	public static void main(String[] args) throws IOException {
		// Initialize the reader
		FastScanner scan = new FastScanner();
		// Initialize the writer
		FastOutput out = new FastOutput();
		/************************************************************************************************************************************/
		// writer your code here
		int n = scan.readInt();
		int[] weight = scan.readIntArray(n);
		int[] price = scan.readIntArray(n);
		int capacity = scan.readInt();
		int[][] memo = new int[n+1][capacity+1];
		// boolean[][] memo = new boolean[n + 1][capacity + 1];
		out.writeInt(subset_sum(n, capacity, weight));
		/*************************************************************************************************************************************/
	}

	/**************************************************************************************************************************************/
	// do not touch it
	public static String subset_sum_tabulation(int n, int capacity, int[] weight,int[][] memo) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= capacity; j++) {

				if (j == 0) {
					memo[i][j] = 1; // true;
					memo[0][j] = 1; // true;
					

				}else if (weight[i - 1] <= j) {
					memo[i][j] = memo[i - 1][j] + memo[i - 1][j - weight[i - 1]]; // change to || to plus for the boolean value
				} else {
					memo[i][j] = memo[i - 1][j];
				}
			}
		}
		return String.valueOf(memo[n][capacity]);
	}
	public static int subset_sum(int n, int capacity, int[] weight) {
		//change return type to boolean
		if (capacity == 0)
			return 1; // true;
		if (n <= 0)
			return 0; // false;
		int total_count = 0;
			if (weight[n - 1] <= capacity) {
			// if (subset_sum(n - 1, capacity - weight[n - 1], weight)) {
			// 	return true;
			// }
			int count = subset_sum(n-1, capacity-weight[n-1], weight);
			if(count!=0){
				total_count+=count;
			}
			// return subset_sum(n-1, capacity-weight[n-1], weight) || subset_sum(n-1,
			// capacity, weight);
		}
		total_count+=subset_sum(n - 1, capacity, weight);
		return total_count;
	}
	public static int kapsack_tabulation(int n, int capacity, int[] weight, int[] price, int[][] memo) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= capacity; j++) {
				if (i == 0 || j == 0) {
					memo[i][j] = 0;
				} else if (weight[i - 1] <= j) {
					memo[i][j] = Math.max(memo[i - 1][j], price[i - 1] + memo[i - 1][j - weight[i - 1]]);
				} else {
					memo[i][j] = memo[i - 1][j];
				}
			}
		}
		return memo[n][capacity];
	}
	public static int knapsack(int n, int capacity, int[] weight, int[] price, int[][] memo) {
		if (capacity == 0 || n == 0)
			return 0;
		if (weight[n - 1] <= capacity) {
			memo[n][capacity] = Math.max(knapsack(n - 1, capacity, weight, price, memo),
					price[n - 1] + knapsack(n - 1, capacity - weight[n - 1], weight, price, memo));
			return memo[n][capacity];
		}
		memo[n][capacity] = knapsack(n - 1, capacity, weight, price, memo);
		return memo[n][capacity];
	}

	/**************************************************************************************************************************************/
	// Write here the function which do you want to insert into the code during the
	// sumbition
	// this function will the gcd of two numbers
	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// this will return the pow of a^b
	public static long bin(long a, long b) {
		long res = 1;
		while (b != 0) {
			if (b % 2 != 0)
				res *= a;
			a *= a;
			b /= 2;
		}
		return res;
	}

	public static long bin_mod(long a, long b, long mod) {
		long res = 1;
		a %= mod;
		while (b != 0) {
			if (b % 2 != 0)
				res *= (a % mod);
			a *= (a % mod);
			b /= 2;
		}
		return res;
	}

	// this will return true if a is prime and false if not
	public static boolean primeornot(long a) {
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
				// System.out.println(i);
				return false;

			}
		}
		return true;
	}

	// this function will check that a given string is palindrome or not
	public static boolean palindrome(String string) {
		StringBuffer buffer = new StringBuffer(string);
		buffer = buffer.reverse();
		if (string.equals(buffer.toString())) {
			return true;
		}
		return false;
	}

	// this function count the number of digit in a number
	public static int count_Digit(long a) {
		int count = 0;
		while (a != 0) {
			a = a / 10;
			count++;
		}
		return count;
	}

	// this function will check weather a number is a perfect_square or not
	public static boolean perfect_square(Long n) {
		if (n >= 0) {
			if (Math.ceil((double) Math.sqrt(n)) == Math.floor((double) Math.sqrt(n))) {
				return true;
			}
		}
		return false;
	}

	/*************************************************************************************************************************/
	/****************************************************************************************************************************************/
	// Fast Reader Class
	public static class FastScanner {

		// Reader object
		BufferedReader reader;

		// Constructor
		public FastScanner() {

			// Initialize the reader
			reader = new BufferedReader(new InputStreamReader(System.in));

			if (System.getProperty("ONLINE_JUDGE") == null) {
				try {
					reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
				} catch (Exception e) {
				}
			}
		}

		// String tokenizer
		StringTokenizer tokenizer;

		// Function to read a
		// single integer
		// to extend the fast reader class writer your function here

		public int readInt() throws IOException {
			return Integer.parseInt(reader.readLine());
		}

		// Function to read a
		// single long
		public long readLong() throws IOException {
			return Long.parseLong(reader.readLine());
		}

		// Function to read string
		public String readString() throws IOException {
			return reader.readLine();
		}

		// Function to read a array
		// of numsInts integers
		// in one line
		public int[] readIntArray(int n) throws IOException {
			int[] nums = new int[n];
			tokenizer = new StringTokenizer(reader.readLine());

			for (int i = 0; i < n; i++) {
				nums[i] = Integer.parseInt(tokenizer.nextToken());
			}
			return nums;
		}

		public Long[] readLongArray(int n) throws IOException {
			tokenizer = new StringTokenizer(reader.readLine());
			Long[] arr = new Long[n];
			int i = 0;
			while (tokenizer.hasMoreTokens()) {
				arr[i] = Long.parseLong(tokenizer.nextToken());
				i++;
			}
			return arr;
		}

		public List<Integer> readIntAsList() throws IOException {
			List<Integer> list = new ArrayList<Integer>();
			tokenizer = new StringTokenizer(reader.readLine());
			while (tokenizer.hasMoreTokens()) {
				list.add(Integer.parseInt(tokenizer.nextToken()));
			}
			return list;
		}

	}

	// Fast Writer Class
	public static class FastOutput {

		// Writer object
		BufferedWriter writer;

		// Constructor
		public FastOutput() {

			// Initialize the writer
			writer = new BufferedWriter(new OutputStreamWriter(System.out));
			if (System.getProperty("ONLINE_JUDGE") == null) {
				try {
					writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
				} catch (Exception e) {
				}
			}
		}

		// Function to write the
		// single integer
		public void writeInt(int i) throws IOException {
			writer.write(Integer.toString(i));
			writer.newLine();
			writer.flush();
		}

		// Function to writer a single character
		public void writeChar(char c) throws IOException {
			writer.write(Character.toString(c));
			writer.newLine();
			writer.flush();
		}

		// Function to write single long
		public void writeLong(long i) throws IOException {
			writer.write(Long.toString(i));
			writer.newLine();
			writer.flush();
		}

		// Function to write String
		public void writeString(String s) throws IOException {
			writer.write(s);
			writer.newLine();
			writer.flush();
		}

		public void writeStringWithSpace(String s) throws IOException {
			writer.write(s);
			writer.write(" ");
			writer.flush();
		}

		// Function to write a Integer of
		// array with spaces in one line
		public void writeIntArray(int[] nums) throws IOException {
			for (int i = 0; i < nums.length; i++) {
				writer.write(nums[i] + " ");
			}
			writer.newLine();
			writer.flush();
		}

		// Function to write Integer of
		// array without spaces in 1 line
		public void writeIntArrayWithoutSpaces(int[] nums) throws IOException {
			for (int i = 0; i < nums.length; i++) {
				writer.write(Integer.toString(nums[i]));
			}
			writer.newLine();
			writer.flush();
		}

		public void writelist(List<Integer> num) throws IOException {
			if (num != null) {
				for (Integer integer : num) {
					writer.write(integer + " ");

				}
			}
			writer.newLine();
			writer.flush();
		}

		public void write_matrix(int[][] matrix) throws IOException {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					writer.write(matrix[i][j] + " ");
				}
				writer.newLine();
			}
			writer.newLine();
			writer.flush();

		}

	}
}
