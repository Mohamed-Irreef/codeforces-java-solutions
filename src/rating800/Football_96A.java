package src.rating800;
import java.util.Scanner;
public class Football_96A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String players = sc.nextLine();
        int count=1;
        for(int i=1;i<players.length();i++){
            if(players.charAt(i-1)==players.charAt(i)){
                count++;
                if(count>=7){
                    break;
                }
            }else {
                count=1;
            }
        }
        if(count>=7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
