// fast input output
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		// Initialize the reader
		FastScanner scan = new FastScanner();
		// Initialize the writer
		FastOutput out = new FastOutput();
/*********************************************************************************************************************************************/
		// writer your code here

		// String str = scan.readString();
		// int integer = scan.readInt();
		Long integer = scan.readLong();
		// integer = solve(integer);
		// out.writeString(Integer.toBinaryString(integer));
		// if (solve(integer)) {
		// 	out.writeString("Yes this integer is a power of two");
		// }else{
		// 	out.writeString("NO this number is not a power of two");
		// }

			
		int i = solve(integer);
		out.writeInt(i);

			



		/*********************************************************************************************************************************************/
	}	
		/*********************************************************************************************************************************************/
		// writer your function code here Accepted


// public static Boolean solve(int integer) {
// 	while ((integer&1)==0) {
// 		integer>>=1;
// 	}

// 	if (integer==1) {
// 		return true;
// 	}
// 	return false; 
// }

// public static int solve(Long integer) {
// 	int count=0;
// 	while (integer>0) {
// 		count++;
// 		integer&=integer-1;
// 	}
// 	return count ;
// }
public static int solve(Long integer) {
	int ans = 1; 
	while (integer>0) {
		if ((integer&1)==0) {
			ans = ans *2;
		}
		integer>>=1;
	}
	return ans ;
}




























	

/**********************************************************************************************************************************************/
	// Fast Reader Class
	public static class FastScanner {

		// Reader object
		BufferedReader reader;

		// Constructor
		public FastScanner()
		{

			// Initialize the reader
			reader = new BufferedReader(
				new InputStreamReader(
					System.in));

			if (System.getProperty(
					"ONLINE_JUDGE")
				== null) {
				try {
					reader = new BufferedReader(
						new InputStreamReader(
							new FileInputStream(
								"input.txt")));
				}
				catch (Exception e) {
				}
			}
		}

		// String tokenizer
		StringTokenizer tokenizer;

		// Function to read a
		// single integer
		// to extend the fast reader class writer your function here 

		public int readInt()throws IOException{
			return Integer.parseInt(
				reader.readLine());
		}

		// Function to read a
		// single long
		public long readLong()throws IOException{
			return Long.parseLong(
				reader.readLine());
		}
		// Function to read string
		public String readString()throws IOException{
			return reader.readLine();
		}
		// Function to read a array
		// of numsInts integers
		// in one line
		public int[] readIntArray(int numInts)throws IOException{
			int[] nums = new int[numInts];
			tokenizer
				= new StringTokenizer(
					reader.readLine());

			for (int i = 0;
				i < numInts; i++) {
				nums[i] = Integer.parseInt(
					tokenizer.nextToken());
			}
			return nums;
		}


	}

	// Fast Writer Class
	public static class FastOutput {

		// Writer object
		BufferedWriter writer;

		// Constructor
		public FastOutput(){

			// Initialize the writer
			writer = new BufferedWriter(
				new OutputStreamWriter(
					System.out));
			if (System.getProperty(
					"ONLINE_JUDGE")
				== null) {
				try {
					writer = new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream(
								"output.txt")));
				}
				catch (Exception e) {
				}
			}
		}

		// Function to write the
		// single integer
		// to extend the fast reader class writer your function here 
		public void writeInt(int i)throws IOException{
			writer.write(Integer.toString(i));
			writer.newLine();
			writer.flush();
		}

		// Function to write single long
		public void writeLong(long i)throws IOException{
			writer.write(Long.toString(i));
			writer.newLine();
			writer.flush();
		}
		// Function to write String
		public void writeString(String s)throws IOException{
			writer.write(s);
			writer.newLine();
			writer.flush();
		}
		
		// Function to write a Integer of
		// array with spaces in one line
		public void writeIntArray(int[] nums)throws IOException{
			for (int i = 0;
				i < nums.length; i++) {
				writer.write(nums[i]
							+ " ");
			}
			writer.newLine();
			writer.flush();
		}

		// Function to write Integer of
		// array without spaces in 1 line
		public void writeIntArrayWithoutSpaces(int[] nums)throws IOException{
			for (int i = 0;
				i < nums.length; i++) {
				writer.write(
					Integer.toString(
						nums[i]));
			}
			writer.newLine();
			writer.flush();
		}

	}
	


}

