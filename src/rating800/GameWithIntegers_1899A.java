package src.rating800;
import java.util.Scanner;
public class GameWithIntegers_1899A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] results = new String[testCases];
        for(int i = 0; i < testCases; i++){
            int n = sc.nextInt();
            if((n-1)%3==0 || (n+1)%3==0){
                results[i] = "First";
            }else {
                results[i] = "Second";
            }
        }
        for (String res : results){
            System.out.println(res);
        }
    }
}
