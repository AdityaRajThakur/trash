import java.util.*;


public class epic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int t =scan.nextInt();
        
        int[] array;
        for (int i = 0; i < t; i++) {
            int n  = scan.nextInt();
            array= new int[n];
            for (int l = 0; l < n; l++) {
                int e = scan.nextInt();
                list.add(e);
            }
    
            Collections.sort(list);
    
            int k  = 0 ;
            while (!list.isEmpty()) {
                if (list.size()==0 || (list.size()==1)) {
                    break;
                }
                if (list.size()==2) {
                   if (list.get(0)==list.get(1)) {
                    break;
                   }else{
                       list.clear();
                       break;
                   }
                
                }
                if (list.get(k)!=list.get(list.size()-1)) {
                    list.remove(k);
                    list.remove(list.size()-1);
                    k++;
                    
                }
                
                
            }
            System.out.println(list.size());
            list.clear();
        }

        scan.close();
    }
}