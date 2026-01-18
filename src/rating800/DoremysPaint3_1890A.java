package src.rating800;
import java.util.HashMap;
import java.util.Scanner;
public class DoremysPaint3_1890A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] results = new String[testCases];
        for(int i =0; i < testCases; i++){
            int n = sc.nextInt();
            int mid = n/2;
            HashMap<Integer,Integer> map= new HashMap<>();
            boolean flag = false;
            for(int j = 0; j < n; j++){
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num,0)+1);
            }
            if(n==2 || map.size()==1){
                results[i] = "YES";
                continue;
            }
            if(map.size()>2){
                results[i] = "NO";
                continue;
            }

            for(Integer key : map.keySet()){
                if(!(map.get(key)>=mid)){
                    flag=true;
                    break;
                }
            }
            if(flag){
                results[i] = "NO";
                continue;
            }
            results[i]="YES";
        }

        for(String res : results){
            System.out.println(res);
        }
    }
}
