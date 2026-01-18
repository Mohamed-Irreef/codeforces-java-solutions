package CodeforcesContests.round_1074_div4;

import java.util.Scanner;
public class PerfectRoot_2185A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[][] results = new int[testCases][];
        for(int i = 0; i < testCases; i++){
            int n = sc.nextInt();
            int[] ans = new int[n];
            for (int j = 0; j < n; j++){
                ans[j] = j+1;
            }
            results[i] = ans;
        }

        for (int[] array : results){
           for(int num : array){
               System.out.print(num+" ");
           }
            System.out.println();
        }
    }
}
