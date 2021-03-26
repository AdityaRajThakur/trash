/**
 * count
 */

import java.util.*;
public class count {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        String string = scan.nextLine();
        string = string.trim();
        if (string.length()!=0){
            for (int i = 0; i < string.length();i++) {
                char c = string.charAt(i);
                if (c!='{' && c!=','&& c!='}' && c!=' ') {
                    if (list.contains(c)==false) {
                        list.add(c);
                    }
                }
            }
            System.out.println(list.size());
        }else{
            System.out.println("0");
        }
        scan.close();
        
    }
}