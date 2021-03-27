import java.util.*;

public class napolean {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    
    int[] array ;
    for (int i = 0; i < t; i++) {
        int n = scan.nextInt();
        array = new int[n];
        for (int j = 0; j < n; j++) {
            array[j] = scan.nextInt();
        }
        solve(n,array);
        System.out.println();
    }
    scan.close();
    }
    public static void solve(int n , int[] array){
        /*
        for (int i = 0; i < n; i++) {
            if (array[i]!=0) {
                int k =  i ; 
                for (int j = array[i];j>0; j--) {
                
                    if (k>=0) {
                        if (array[k]!=1) {
                            array[k]=1;
                        }
                        k--;
                    }
                    

                }
            }
        }*/
        recursice(0, array);
        for (int i : array) {
            System.out.print(i+ " ");
        }
    }
    public static void recursice(int ith, int[] array){
        if (ith==array.length) return;
        ith+=1;
        recursice(ith,array);
        int i = array[ith-1];
        int k = ith-1;
        if (array[ith-1]!=0) {
            for (int j = 0; j < i; j++) {
                array[k]=1;
                k--;
            }
        }

    }
}
