import java.util.Scanner;

public class polycarps {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int t , n , m;
        long x ;
        int[][] by_row ;
        t = scan.nextInt();
        for (int f = 0; f < t; f++) {

        n = scan.nextInt();
        m = scan.nextInt();
        
        int[][] by_column ;
        x = scan.nextLong();
        int count = 0;
        long nm = n*m;
        if(x%(n*m)!=0){
            by_row = new int[n][m];
            by_column = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    count++;
                    by_row[i][j] = count;  
                    
                }
        }
        int count1 = 0 ; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count1++;
                by_column[j][i] = count1;
            }
        }
        long x1=0, y1=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (by_column[i][j]==x) {
                    x1=i;
                    y1=j;
                }    
            }
            
        }
        System.out.println(by_row[(int)x1][(int)y1]);
        }else{
            System.out.println((long)x);
        }

        
    }
    scan.close();
}
}