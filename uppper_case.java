import java.util.*;


public class uppper_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string  = scan.nextLine();
        string = string.trim();
        int len = string.length();
        int upper = 0; 
        int lower = 0 ;
        for (int i = 0; i < len; i++) {
            Character c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                upper++;
            }else{
                lower++;
            }
        }
        if (upper>lower) {
            System.out.println(string.toUpperCase());
        }else{
            System.out.println(string.toLowerCase());
        }
        scan.close();
    }
}
