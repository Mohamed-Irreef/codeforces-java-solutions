package src.rating800;
import java.util.*;

public class Taxi_158B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] groupsFreq = new int[5];
        for(int i=0;i<n;i++){
            int group = sc.nextInt();
            groupsFreq[group]++;
        }

        int taxi =0;
        taxi+=groupsFreq[4];
        if(groupsFreq[3]>0 && groupsFreq[1]>0 && groupsFreq[1]<=groupsFreq[3]){
            taxi+=groupsFreq[1];
            taxi+=groupsFreq[3]-groupsFreq[1];
            groupsFreq[1]=0;
        } else if (groupsFreq[3]>0 && groupsFreq[1]>0 && groupsFreq[1]>groupsFreq[3]) {
            taxi+=groupsFreq[3];
            groupsFreq[1]=groupsFreq[1]-groupsFreq[3];
        }else {
            taxi+=groupsFreq[3];
        }


        if((groupsFreq[1]+(groupsFreq[2]*2))/4 > 0){
            taxi+=(groupsFreq[1]+(groupsFreq[2]*2))/4;
        }
        if((groupsFreq[1]+(groupsFreq[2]*2))%4 > 0){
            taxi++;
        }


        System.out.println("Total Taxis: "+ taxi);
    }
}
