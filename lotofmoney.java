import java.util.*;


public class lotofmoney {

    public static int[] denominate = new int[]{1, 5, 10, 20, 100};
    public static int[] array = new int[5];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money  = scan.nextInt();
        System.out.println(bills(money));

        
        scan.close();
    }
    public static int bills(int money){
        int count = 1; 
         
        if (money==1 || money == 0) return 1;
        if (money<0)  return 0;
        
        for (int i = 0; i < denominate.length; i++) {
        
             
            
            count+=bills(money-denominate[i]);
            

        }
        
        
        return count;

    }
}
