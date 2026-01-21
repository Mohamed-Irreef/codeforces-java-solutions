package src.rating800;

import java.util.Scanner;
public class GoalsOfVictory_1877A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] results = new int[t];
        int track = 0;
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            for(int i =0; i < n-1; i++){
                sum+=sc.nextInt();
            }
            results[track++] = -1*sum;
        }
        for(int num : results){
            System.out.println(num);
        }
    }
}
