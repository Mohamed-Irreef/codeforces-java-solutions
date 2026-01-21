package src.rating800;

import java.util.Scanner;
public class SequenceGame_1862B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] results = new int[t][];
        int idx = 0;
        while(t-->0){
            int n = sc.nextInt();
            int track = 0;

            int[] b = new int[n];
            int breakPoints = 0;
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
                if(i>=1 && b[i-1]>b[i]){
                    breakPoints++;
                }
            }
            int[] a = new int[n+breakPoints];
            a[track++] = b[0];
            for(int j = 1; j < n; j++){

                if(b[j-1] <= b[j]){
                    a[track++] = b[j];
                }else {
                   if(b[j]-1!=0){
                       a[track++] = b[j]-1;
                   }else {
                       a[track++] = b[j];
                   }
                    a[track++] = b[j];
                }
            }
            results[idx++] = a;
        }

        for(int[] arr : results){
            System.out.println(arr.length);
            for(int num : arr){

                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
