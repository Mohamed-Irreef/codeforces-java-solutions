package src.rating800;
import java.util.Map;
import java.util.Scanner;
public class Desorting_1853A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }
            int shortDiff = Integer.MAX_VALUE;
            boolean isSorted = true;
            for(int j = 0; j < n-1; j++){
                int diff = array[j+1] - array[j];
                if(array[j]<=array[j+1]){
                    shortDiff = Math.min(shortDiff,diff);
                }else {
                    isSorted = false;
                    break;
                }

            }

            if(!isSorted){
                System.out.println(0);
            }else {
                int operations = shortDiff/2 +1;
                System.out.println(operations);
            }
        }

    }
}
