import java.util.*;



public class First{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        
        if (x%5==0) {
            if (x>0 && (x+0.50)<=y) {
                x+=.50;
                System.out.printf("%.2f",y-x);
                
            }else{
                System.out.printf("%.2f",y);
            }
        }else{
            System.out.printf("%.2f",y);
        }
        scan.close();

    }
}