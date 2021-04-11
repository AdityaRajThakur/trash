package dynamic_programming;


// fast input output
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// Initialize the reader
		FastScanner scan = new FastScanner();
		// Initialize the writer
		FastOutput out = new FastOutput();
		/*****************************************************************************************************************************************/
		// writer your code here
		int w = scan.readInt();
		int n = scan.readInt();
		int[] weight = scan.readIntArray(n);
		int[] price = scan.readIntArray(n);
		int[][] t = new int[n+1][w+1];

		for(int i = 0; i<=n;i++){
			for(int j = 0 ;j<=w;j++){
				if(i==0 || j == 0){
					t[i][j] = 0 ;
				}else if(weight[i-1]<=j){
					t[i][j] = Integer.max(price[i-1]+t[i-1][j-weight[i-1]],t[i-1][j]);
				}else{
					t[i][j] = t[i-1][j];
				}
			}
		}
		out.writeInt(t[n][w]);
		out.writer_matrix(t);

		



		/*********************************************************************************************************************************************/
	}

	/*********************************************************************************************************************************************/
	// writer your function code here Accepted
	// do not touch it
	/*********************************************************************************************************************************************/

	// this function will the gcd of two numbers
public static long gcd(long a , long b ){
    if (b==0) return a ;
    return gcd(b,a%b)
}

	// this will return the pow of a^b
	public static long bin_exp(long a, long b) {
		long res = 1;
		while (b != 0) {
			if (b % 2 != 0)
				res *= a;
			a *= a;
			b /= 2;
		}
		return res;
	}

	// this will return true if a is prime and false if not
	public static boolean primeornot(long a) {
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
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

	/*************************************************************************************************************************/
	/**********************************************************************************************************************************************/
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
		public int[] readIntArray(int numInts) throws IOException {
			int[] nums = new int[numInts];
			tokenizer = new StringTokenizer(reader.readLine());

			for (int i = 0; i < numInts; i++) {
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
		// to extend the fast reader class writer your function here
		// public void writerboolean(boolean b) throws IOException{
		// if (b==true) {
		// writer.write("true");
		// }else{
		// writer.write("false");
		// }
		// }
		public void writeInt(int i) throws IOException {
			writer.write(Integer.toString(i));
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
		public void writer_matrix(int[][] matrix )throws IOException{
			for (int i = 0; i <matrix.length; i++) {
				for (int j = 0; j <matrix[0].length; j++) {
					writer.write(matrix[i][j]+" ");
				}
				writer.newLine();
			}
			writer.newLine();
			writer.flush();

		}

	}

}
