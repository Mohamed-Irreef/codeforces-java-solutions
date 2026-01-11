package src.rating800;

import java.util.Scanner;
public class WayTooLongWords_71A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String word= sc.nextLine().trim();
            if(word.length()>10){
                int len=word.length()-2;
                System.out.println(word.charAt(0)+""+len+word.charAt(word.length()-1));
            }else {
                System.out.println(word);
            }

        }

    }
}
