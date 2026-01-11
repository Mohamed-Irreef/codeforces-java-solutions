package src.rating800;
import java.util.Scanner;

public class PetyaString_112A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word1= sc.nextLine().toLowerCase();
        String word2= sc.nextLine().toLowerCase();
        int compare = word1.compareTo(word2);
        if(compare>0){
            System.out.println(1);
        } else if (compare<0) {
            System.out.println(-1);
        }else {
            System.out.println(0);
        }
    }
}
