import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int k = 0; k < t; k++) {
    
        String string_a = scan.next();
        String string_b = scan.next();
        string_a = string_a.trim();
        string_b = string_b.trim();
        int count = 0 ;
        for (int i = 0; i < Math.max(string_a.length(),string_b.length()); i++) {
            if (string_a.length()>0) {
                string_a =string_a.substring(1);
                count++;
            }
            if (string_a.length()>0) {
                string_a  =string_a.substring(0,string_a.length()-1);
                count++;
            }

            if (string_a.equals(string_b)||string_a=="" && string_b=="") {
                System.out.println(count);
                break;
            }

            if (string_b.length()>0) {
                string_b =string_b.substring(1);
                count++;
            }
            if (string_b.length()>0) {
                string_b  =string_b.substring(0,string_b.length()-1);
                count++;
            }
        }
    }
}
}
