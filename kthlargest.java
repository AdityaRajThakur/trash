import java.util.*;




public class kthlargest{
    public static void first_query(int i, int[] array){
        array[i] = 1- array[i];
    }
    public static  int largest_element(int k , int[] array){
        List<Integer> list = new ArrayList<>();
        for (int integer : array) {
            list.add(integer);
        }
        Collections.sort(list);
        return list.get((list.size()-k));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array;
        int n , q ;
        n = scan.nextInt();
        q = scan.nextInt();
        array = new int[n];
        for(int i = 0 ; i<array.length;i++){
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int q_t , x_k;
            q_t = scan.nextInt();
            x_k = scan.nextInt();
            if(q_t==1){
                first_query(q_t, array);
            }else {
                System.out.println(largest_element(x_k,array));
            }
        }
        scan.close();
    }
}