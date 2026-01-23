package src.rating800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SequenceGame_1862B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<ArrayList<Integer>> results = new ArrayList<>();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 0; i < n; i++){
               b.add(sc.nextInt());
            }
            a.add(b.getFirst());
            for(int j = 1; j < b.size(); j++){
                if(b.get(j-1)<=b.get(j)){
                    a.add(b.get(j));
                }else {
                    a.add(b.get(j));
                    a.add(b.get(j));
                }
            }
           results.add(a);
        }

        for(ArrayList<Integer> list : results){
            System.out.println(list.size());
            for (Integer l : list){
                System.out.print(l+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
