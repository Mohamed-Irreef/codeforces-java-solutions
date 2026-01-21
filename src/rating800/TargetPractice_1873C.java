package src.rating800;
import java.util.Scanner;
public class TargetPractice_1873C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] scores = new int[t];
        int idx = 0;
        sc.nextLine();
        while (t-->0){
            char[][] states = new char[10][];
            int score = 0;
            for(int i = 0; i < 10; i++ ){
                states[i] = sc.nextLine().toCharArray();
            }
            for(int j =0; j < 10; j++){
                for(int k =0; k < 10; k++){
                    char c = states[j][k];
                    if(c=='X'){
                        if( ((j==1||j==8) && (k>=1 && k<=8)) || ((k==1||k==8) && (j>=1 && j<=8))){
                            score+=2;
                        } else if (((j==2||j==7) && (k>=2 && k<=7)) || ((k==2||k==7) && (j>=2 && j<=7))) {
                            score+=3;
                        } else if (((j==3||j==6) && (k>=3 && k<=6)) || ((k==3||k==6) && (j>=3 && j<=6))) {
                            score+=4;
                        } else if (((j==4||j==5) && (k>=4 && k<=5)) || ((k==4||k==5) && (j>=4 && j<=5))) {
                            score+=5;
                        }else {
                            score+=1;
                        }
                    }

                }
            }
            scores[idx++] = score;
        }

        for (int res : scores){
            System.out.println(res);
        }
    }
}
