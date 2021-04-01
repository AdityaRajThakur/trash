// fast input output
import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		// Initialize the reader
		FastReader reader = new FastReader();
		// Initialize the writer
		FastWriter writer = new FastWriter();
/*********************************************************************************************************************************************/
		// writer your code here
		int t = reader.readInt();
	
		while (t-->0) {
			long num = reader.readLong();
			writer.writeString(solve(num));







		}
/*********************************************************************************************************************************************/
	}
/*********************************************************************************************************************************************/
	// writer your function hereAccepted

	public static String solve(long num){
		
		while ((num&1)==0) {
			num>>=1;
		}
		if (num==1) {
			return "NO";
		}
		return "YES";
		}

/**********************************************************************************************************************************************/

	// Fast Reader Class
	public static class FastReader {

		// Reader object
		BufferedReader reader;

		// Constructor
		public FastReader()
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

		public int readInt()
			throws IOException
		{
			return Integer.parseInt(
				reader.readLine());
		}

		// Function to read a
		// single long
		public long readLong()
			throws IOException
		{
			return Long.parseLong(
				reader.readLine());
		}
		// Function to read string
		public String readString()
			throws IOException
		{
			return reader.readLine();
		}
		// Function to read a array
		// of numsInts integers
		// in one line
		public int[] readIntArray(int numInts)
			throws IOException
		{
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
	public static class FastWriter {

		// Writer object
		BufferedWriter writer;

		// Constructor
		public FastWriter()
		{

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
		public void writeInt(int i)
			throws IOException
		{
			writer.write(Integer.toString(i));
			writer.newLine();
			writer.flush();
		}

		// Function to write single long
		public void writeLong(long i)
			throws IOException
		{
			writer.write(Long.toString(i));
			writer.newLine();
			writer.flush();
		}
		// Function to write String
		public void writeString(String s)
			throws IOException
		{
			writer.write(s);
			writer.newLine();
			writer.flush();
		}
		// Function to write a Integer of
		// array with spaces in one line
		public void writeIntArray(int[] nums)
			throws IOException
		{
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
		public void writeIntArrayWithoutSpaces(int[] nums)
			throws IOException
		{
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

