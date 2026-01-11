package src.rating800;
import java.util.Scanner;
public class VanyaAndFence_677A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hf = sc.nextInt();
        int width=0;
        for(int i=0;i<n;i++){
            int hp = sc.nextInt();
            if(hp>hf){
                width+=2;
            }else {
                width++;
            }
        }
        System.out.println(width);
    }
}
