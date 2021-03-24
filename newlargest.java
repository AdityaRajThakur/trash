import java.util.*;




public class newlargest{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array;
        int n , q ;
        n = scan.nextInt();
        q = scan.nextInt();
        int count = 0 ; 
        array = new int[n];
        for(int i = 0 ; i<array.length;i++){
            int a = scan.nextInt();
            array[i] = a;
            count = count + array[i];
        }
        for (int i = 0; i < q; i++) {
            int q_t , x_k;
            q_t = scan.nextInt();
            x_k = scan.nextInt();
            if(q_t==1){
                if (array[x_k-1]==1) {
                   count--; 
                }else{
                    count++;
                }
                array[x_k-1]  = 1 - array[x_k-1];
            }else{
                if (count>=x_k) {
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
        }
        scan.close();
    }
}

