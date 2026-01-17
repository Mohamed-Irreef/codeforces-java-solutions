package src.rating800;
import java.util.Scanner;

public class JaggedSwaps_1896A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        String[] result = new String[testCases];
        for(int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            // Just check the First element. If the first element is 1 then, sort is possible else not.
            // Don't need to check others
            if(array[0]==1){
                result[i]="YES";
            }else {
                result[i]="NO";
            }

        }

        for(String res: result){
            System.out.println(res);
        }
    }
}