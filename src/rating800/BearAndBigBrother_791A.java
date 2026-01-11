package src.rating800;
import java.util.Scanner;
public class BearAndBigBrother_791A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lw = sc.nextInt();
        int bw = sc.nextInt();
        int years =0;
        while(lw<=bw){
            lw=3*lw;
            bw=2*bw;
            years++;
        }
        System.out.println(years);

    }
}

