import java.util.*;


public class epic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t =scan.nextInt();
        int n  = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
        int j  = 0;
        int k  = array.length-1;
        while (array.length!=0) {
            if (array[j]!=array[k]) {
                array = Arrays.copyOfRange(array, 1, array.length-1);
                j++;
                k--;
            }
        }
        scan.close();
    }
}