package src.rating800;
import java.util.Scanner;
public class Word_59A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine();
        int cap=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                cap++;
            }
            if(cap>word.length()/2){
                break;
            }
        }
        if(cap>word.length()/2){
            System.out.println(word.toUpperCase());
        }else {
            System.out.println(word.toLowerCase());
        }
    }
}
