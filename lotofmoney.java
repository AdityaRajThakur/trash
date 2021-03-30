import java.util.*;


public class lotofmoney {

    public static int[] denominate = new int[]{100,20,10,5,1};
    public static int[] array = new int[5];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money  = scan.nextInt();
        int i = 0;
        int sum = 0 ;
        while (money!=0) {
            sum+=money/denominate[i];
            money %=denominate[i];
            i++;
        }
        System.out.println(sum);
        scan.close();
    }

}
