package src.rating800;
import java.util.Scanner;
public class Buttons_1858A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a+c == b+c) && c%2 == 0){
                System.out.println("Second");
            } else if ((a+c == b+c) && c%2 != 0) {
                System.out.println("First");
            } else if (a+c > b+c) {
                System.out.println("First");
            }else {
                System.out.println("Second");
            }
        }
    }
}
