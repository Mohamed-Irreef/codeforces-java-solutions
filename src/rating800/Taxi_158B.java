package src.rating800;
import java.util.*;

public class Taxi_158B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=sc.nextInt();
        }
        int carCount=0;
        int i=1;
        while(carCount<sum){
            carCount=i*4;
            i++;
        }
        System.out.println(carCount/4);
    }
}
