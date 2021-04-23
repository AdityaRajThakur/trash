
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
		/*********************************************************************************************************************************************/
		// writer your code here
		int t = scan.readInt();
		while (t-->0) {
			Map<Integer,Boolean> memorize = new HashMap<>();
			int n = scan.readInt();
			List<Integer> arr = scan.readIntAsList();
			System.out.println(cansum(n, arr,memorize));
		}

	/*********************************************************************************************************************************************/
	}

	/*********************************************************************************************************************************************/
	// writer your function code here Accepted
	public static boolean cansum(int n , List<Integer> arr,Map<Integer,Boolean> memorize) {
		if (n==0) return true;
		if (n<0) return false;
		if (memorize.get(n)!=null) return memorize.get(n);
		for (Integer integer : arr) {
			int left = n - integer;
			
			
			if (left==n) memorize.put(left,false);
			memorize.put(left,cansum(left, arr,memorize));
			if (memorize.get(left)== true){
				return true;
			 }
		}
		memorize.put(n, false);
		return false; 
	}
	// this equal sum partition function which use the element in the array only one time the function above use the array element as many times as possible this function is not 
	// public static  List<Integer>  equal_sum_partition(int sum,int n ,List<Integer> arr){
	// 	// if(sum==0) return true;
	// 	if(sum==0) return new ArrayList<>();
	// 	// if (sum<0 || n<=0) return false;
	// 	if (sum<0 || n<=0) return null;
	// 	if(arr.get(n-1)<=sum){
	// 		// if(equal_sum_partition(sum-arr.get(n-1), n-1, arr)) return true;
	// 		int left = sum - arr.get(n-1);
	// 		List<Integer> combination = equal_sum_partition(left,n-1,arr);
	// 		if(combination!=null){
	// 			combination.add(arr.get(n-1));
	// 			return combination;
	// 		}
	// 	}
	// 	return equal_sum_partition(sum, n-1, arr);
	// }



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
		public Long[] readLongArray(int n)throws IOException{
			tokenizer = new StringTokenizer(reader.readLine());
			Long[] arr= new Long[n];
			int i =0;
			while (tokenizer.hasMoreTokens()) {
				arr[i]  = Long.parseLong(tokenizer.nextToken());
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
		// 	if (b==true) {
		// 		writer.write("true");
		// 	}else{
		// 		writer.write("false");
		// 	}
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

	}

}
