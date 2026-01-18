package CodeforcesContests.round_1074_div4;
import java.util.Arrays;
import java.util.Scanner;
public class PrefixMax_2185B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] results = new int[testCases];
        for(int i =0; i < testCases; i++){
            int n = sc.nextInt();

            int[] array = new int[n];
            int max = 0;
            for(int j = 0; j < n; j++){
                array[j] = sc.nextInt();
                if(array[j]>array[max]){
                    max = j;
                }
            }
            int temp = array[0];
            array[0] = array[max];
            array[max] =temp;

            int ans = 0;
            int curMax = 0;
            for(int k = 0; k < n; k++){
                curMax = Math.max(curMax,array[k]);
                ans+=curMax;
            }
            results[i] = ans;
        }

        for(int num : results){
            System.out.println(num);
        }
    }
}
