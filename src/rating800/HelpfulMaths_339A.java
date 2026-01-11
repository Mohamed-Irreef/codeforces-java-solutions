package src.rating800;
import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths_339A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        int n=0;
        String[] expArr= exp.split("\\+");
        Arrays.sort(expArr);
        System.out.println(String.join("+",expArr));
    }
}
