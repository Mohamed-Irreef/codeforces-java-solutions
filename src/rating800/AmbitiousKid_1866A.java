package src.rating800;

import java.util.Scanner;
public class AmbitiousKid_1866A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num<0){
               minimum = Math.min(Math.abs(num),minimum);
            }
            if (num>=0) {
               minimum = Math.min(minimum,num);
            }
        }

        System.out.println(minimum);

    }
}
