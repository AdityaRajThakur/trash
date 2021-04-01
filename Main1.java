
/**
 * secondmain
 */
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.math.*;

public class Main {
    // this will return the gcd of a,b 
public static long gcd(long a , long b ){
    if (b==0) return a ;
    return gcd(b,a%b)
}

    // this will return the pow of a^b 
public static long bin_exp(long a , long b){
    long res = 1 ; 
    while (b!=0) {
        if(b%2!=0) res*=a;
        a*=a;
        b/=2;
    }
    return res;
}

    // this will return true if a is prime and false if not
public static boolean primeornot(long a){
    for (int i = 2; i*i<= a; i++) {
        if (a%i==0) {
            return false;
        }
    }
    return true;
}
public static void main(String[] args) throws IOException{
        // use this to read from the system.in or terminal 
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"),StandardCharsets.UTF_8));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int t ; 
        t = Integer.parseInt(br.readLine());
        while (t-->0) {
            String[] str ; 
            str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
        
            String[] str1 = br.readLine().trim().split(" ");
            List<String> list = Arrays.asList(str1); 
            Collections.sort(list);
            output.write(pop(list));
            
            // solve the erro java.util.abstractlist.remove is not working on the lsit ;

            // write your code here 
            output.newLine();
        }
            br.close();

        output.flush();
    }
public static int convert(String str){
        return  Integer.parseInt(str);
    }
public static String pop(List<String> list){
    int len = list.size()-1;
    String str = list.remove(len);
    return str; 
}
public static String solve(List<String> list , int bag){
    int height = 1 ;
    int initial = bag;
    while (true) {
        int num = Integer.parseInt(list.remove(list.size()-1));
        bag-=num;
        if (list.isEmpty()) {
            break;
        }
        
        if (num>bag){
            height++;
            bag= initial;
        }
        
        if (bag==0){
            height++;
            bag = initial;
        }




    }
    return String.valueOf(height);
}
}