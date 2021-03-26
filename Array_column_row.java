import java.util.Scanner;

public class Array_column_row {
    public static void main(String[] args) {
        /*
            1   2    3     4      5
            6   7    8     9     10
            11  12   13     14    15  // in row orders

            1   4   7   10  13   
            2   5   8   11  14
            3   6   9   12  15  in column order

            to find the number in 
            the row order 
            then take the (r,c,x) 
            "x is element in column order" 
            from the column order 
            use this formula 

            x = x-1;
            r1 = (x) % r +1;
            c1 = (x/r)+1;
            x1 = (r1-1)*c+c1;
        
        
        */
        
        Scanner scan = new Scanner(System.in);
        long t , n , m;
        long x ;
      
        t = scan.nextInt();
        for (int f = 0; f < t; f++) {

        n = scan.nextLong();
        m = scan.nextLong();
        x = scan.nextLong();
        x -=1;
        long r = (x%n) +1;
        
        long c = x/n;
        System.out.println((r-1)*m + c+1);
      
    }
    scan.close();
}
}