package src.rating800;

import java.util.Scanner;
public class DaytonaCost_1878A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] results = new String[testCases];
        int track = 0;

        while(testCases-->0){
            boolean found = false;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }
            for(int j = 0; j < n; j++){
                if(array[j] == k){
                    found = true;
                    break;
                }
            }

            if(!found){
                results[track++] = "NO";
            }else{
                results[track++] = "YES";
            }
        }

        for(String res : results){
            System.out.println(res);
        }
    }
}
