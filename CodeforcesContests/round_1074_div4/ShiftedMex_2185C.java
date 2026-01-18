package CodeforcesContests.round_1074_div4;
import java.util.Arrays;
import java.util.Scanner;
public class ShiftedMex_2185C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] results = new int[testCases];

        for(int i = 0; i < testCases; i++){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int j =0; j < n; j++){
                array[j] = sc.nextInt();
            }
            int overalMax =0;
            int max = 0;
            Arrays.sort(array);
            for(int k =1; k < n; k++){
                if(array[k-1]==array[k]){
                    continue;
                }
                if(array[k-1]==array[k]+1){
                    max++;
                    overalMax = Math.max(max,overalMax);
                }
            }
            results[i]=overalMax;
        }
        for(int num : results){
            System.out.println(num);
        }
    }
}
