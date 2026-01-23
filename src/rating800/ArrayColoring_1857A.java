package src.rating800;
import java.util.Scanner;
public class ArrayColoring_1857A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] array = new int[n];
            int total = 0;
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                array[i] = num;
                total += num;
            }
            int curSum = 0;
            boolean flag = false;
            for(int i = 0; i < n; i++){
                curSum += array[i];
                total = total - array[i];
                if(curSum%2==0 && (total)%2==0 && total>0){
                    flag = true;
                    break;
                }
                if(curSum%2!=0 && (total)%2!=0 && total>0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
