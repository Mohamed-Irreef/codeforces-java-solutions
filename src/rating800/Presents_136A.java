package src.rating800;
import java.util.Scanner;
public class Presents_136A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            arr[p-1]=i+1;
        }
        for(int p:arr){
            System.out.print(p+" ");
        }
    }
}
