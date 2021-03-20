import java.util.*;


public class binaryexpo {

    public static int calcu(int num, int pow){
        int res = 1; 
        while (pow!=0) {
            if (pow%2!=0) {
                res*=num;
            }
            num*=num;
            pow/=2;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        int pow = scan.nextInt();
        System.out.println(calcu(num, pow));
        scan.close();
    }
}
