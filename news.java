import java.util.Scanner;

public class news {
    public static void main(String[] args) {
        String[] st = new String[2];
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        string = string.trim();
        st = string.split(" ");
        if (st[0].equals(st[1])) {
            System.out.println(st[0]);
        }else{
            System.out.println(1);
        }
        // System.out.println(st[0]);
        scan.close();
    }
}
