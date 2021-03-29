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
        String string ;
        while (br.ready()) {
            string = br.readLine();
            bw.write(string);
            bw.newLine();
        }
        br.close();
        bw.close();
       
        
       }
       
    
}       