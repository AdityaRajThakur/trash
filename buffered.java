/**
 * buffered
 */
import  java.io.*;


public class buffered {

    public static void main(String[] args) throws IOException {
        
       BufferedReader br = new BufferedReader(new FileReader("input.txt"));
       BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        
        // String string = br.readLine();
        // bw.write(string); 
        
        // br.ready() is used to check that buffered is ready to read the line
        // br.readLine() is used to the nextline in the file 

        // write from here....
        int t = Integer.parseInt(br.readLine());

        while (t-->0) {
            String str = br.readLine();
   
         bw.newLine();
            bw.write(str);

        }

        br.close();
        bw.close();
       
        
       }
       
    
}       