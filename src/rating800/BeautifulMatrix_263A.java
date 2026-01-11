package src.rating800;
import java.util.Scanner;
public class BeautifulMatrix_263A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int steps=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int n=sc.nextInt();
                if(n==1){
                    int x=i+1;
                    int y=j+1;
                    steps=Math.abs(3-x)+Math.abs(3-y);
                }
            }
        }
        System.out.println(steps);
    }
}
