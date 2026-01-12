package src.rating800;
import java.util.HashMap;
import java.util.Scanner;
public class Football_43A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> freqMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String team = sc.nextLine();
            freqMap.put(team,freqMap.getOrDefault(team,0)+1);
        }
        int max=0;
        String winner="";
        for(String key:freqMap.keySet()){
            if(freqMap.get(key)>max){
                winner=key;
                max=freqMap.get(key);
            }
        }
        System.out.println(winner);
    }
}
