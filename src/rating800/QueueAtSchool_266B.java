package src.rating800;
import java.util.Scanner;
public class QueueAtSchool_266B {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String seq= sc.nextLine();
        char[] charArray = seq.toCharArray();

        for(int i=0;i<t;i++){

            for(int j=1;j<charArray.length;j++){
                char cur=charArray[j];
                char prev =charArray[j-1];
                if(cur=='G' && prev=='B') {
                    charArray[j - 1] = cur; // prev =cur;
                    charArray[j] = prev; //cur=prev;
                    j++;
                }
            }
        }
        System.out.println(new String(charArray));
    }
}
