import java.util.*;


public class epic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t  ; 
        t = scan.nextInt();
        while (t>0) {
            int n  ,  k ; 
            n = scan.nextInt();
            k = scan.nextInt();
            char[] string = new char[n];
            String str = scan.next();
            str = str.trim();
            string = str.toCharArray();
            int i = 0 ;
            int j = string.length-1;
            int count =  0;
            if(n == 1 ){
                if(string[0]=='*'){
                    System.out.println(1);
                     
                }else{
                    System.out.println(0);
                }
                return ; 
            }

            while (i<=j){
                if (string[i]=='*'  ) {
                    string[i] = 'X';
                    count++;
                    
                    break;
                }
                i++;
            }
            while (j>=i) {
                if(string[j]=='*'){
                    string[j] = 'X';
                    count++;
                    break;
                }
                j--;
            }
        

            for (int l = 0; l <n; l++) {
                if(string[l]=='.') continue ; 

                if(string[l]=='X'){
                    for(int o=  1 ; o<=k; o++ ){
                        
                    }
                }
        }

            System.out.println(count);
            t--;
        }
        scan.close();
    }
}