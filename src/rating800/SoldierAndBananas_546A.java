package src.rating800;
import java.util.Scanner;
public class SoldierAndBananas_546A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n= sc.nextInt();
        int w= sc.nextInt();
        int total = (w*(w+1)/2)*k;
        if(total>n){
            System.out.println(total-n);
        }else {
            System.out.println(0);
        }
    }
}
