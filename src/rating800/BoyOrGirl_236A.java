package src.rating800;
import java.util.Scanner;
public class BoyOrGirl_236A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        boolean[] freq = new boolean[26];
        int count=0;
        for(char c: text.toCharArray()){
            int idx=(int)c-97;
            if(!freq[idx]){
                freq[idx]=true;
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
    }
}
