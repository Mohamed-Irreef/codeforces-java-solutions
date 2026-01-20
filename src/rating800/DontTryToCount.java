package src.rating800;

import java.util.Scanner;

public class DontTryToCount {

//    To check whether the given "S" String is exist in the "X" string in rotation
//    If "S" is available in the "X" string in rotation, then return tru otherwise return false
//    Before counting the number of operations (step), we have to check whether the given "S" is available in the "X" string because the count logic will fix/assign the "S" string must be available in the "X" string. if not there then the while loop for count logic will not terminate and keeps running for infinite time. So To avoid this first we have to check whether the "S" is available in "X" or not. If not, isPossible() return false and then the resul will be marked as -1;
    public static boolean isPossible(String x, String s){
        for(int idx = 0; idx < x.length(); idx++){
            if(x.charAt(idx) == s.charAt(0)){
                int start = idx;
                boolean isWrong = false;
                for(int i =0; i < s.length(); i++){
                    if(x.charAt(start) != s.charAt(i)){
                        isWrong = true;
                        break;
                    }else {
                        start++;
                        if(start >= x.length()){
                            start = 0;
                        }
                    }
                }
                if(!isWrong){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] results = new int[testCases];
        for(int i = 0; i < testCases; i++){

            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();
            String s = sc.nextLine();

            if(isPossible(x,s)){
                int step =0;
                while (!x.contains(s)){
                    x+=x;
                    step++;
                }
                results[i] = step;
            }else {
                results[i] = -1;
            }

        }

        for(int res : results){
            System.out.println(res);
        }
    }

}
