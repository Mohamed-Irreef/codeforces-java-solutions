package src.rating800;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class UnitedWeStand_1859A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] array = new int[n];
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }
            int max = Arrays.stream(array).max().getAsInt();
            for(int num : array){
                if(num!=max){
                    b.add(num);
                }else {
                    c.add(num);
                }
            }

            if(b.size()==0 || c.size()==0){
                System.out.println(-1);
                continue;
            }
            System.out.println();
            System.out.println(b.size()+" "+c.size());
            for(Integer num : b){
                System.out.print(num+" ");
            }
            System.out.println();
            for(Integer num : c){
                System.out.print(num+" ");
            }
        }


    }
}
