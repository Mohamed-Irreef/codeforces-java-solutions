package src.rating800;
import java.util.Scanner;
public class ElephantSteps_617A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem= n%5;//always the rem will be less than 5
        int step=n/5;
        if(rem>0){
            step++;
        }
        System.out.println(step);
    }
}
