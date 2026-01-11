package src.rating800;
import java.util.Scanner;
public class Drinks_200B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float qty=0;
        for(int i=0;i<n;i++){
            qty += sc.nextFloat()/100;
        }
        System.out.println((qty/n)*100);
    }
}
