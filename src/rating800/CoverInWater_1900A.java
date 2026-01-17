package src.rating800;
import java.util.Scanner;

public class CoverInWater_1900A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        int[] answers = new int[testCases];

        for(int i = 0; i < testCases; i++){
            int length = sc.nextInt();
            sc.nextLine();
            String cells = sc.nextLine();
            if(cells.contains("...")){
                answers[i]=2;
            }else {
                char[] charArray = cells.toCharArray();
                int count =0;
                for(char c : charArray){
                    if(c=='.'){
                        count++;
                    }
                }
                answers[i]=count;
            }
        }

        for(int ans : answers){
            System.out.println(ans);
        }
    }
}
