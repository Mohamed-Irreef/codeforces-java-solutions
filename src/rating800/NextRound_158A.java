package src.rating800;

import java.util.Scanner;
public class NextRound_158A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr= new int[n];
        int selected=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=arr[k-1] && arr[i]>0){
                selected++;
            }
        }
        System.out.println(selected);
    }
}
