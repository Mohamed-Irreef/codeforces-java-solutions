package src.rating800;
import java.util.Scanner;
public class GeorgeAndRound_387B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] pir = new int[n]; //problemsInRound
        int[]  pp = new int[m]; //problemsPrepared
        for (int i=0;i<n;i++){
            pir[i]=sc.nextInt();
        }
        for (int j=0;j<m;j++){
            pp[j]=sc.nextInt();
        }
        int ptr1=0;
        int ptr2=0;

        while (ptr1<n && ptr2<m){
            if(pp[ptr2]>=pir[ptr1]){
                ptr1++;
                ptr2++;
            }else if(pp[ptr2]<pir[ptr1]){
                ptr2++;
            }
        }
        System.out.println(n-(ptr1));
    }
}
