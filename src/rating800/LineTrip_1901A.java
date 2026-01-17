package src.rating800;
import java.util.Arrays;
import java.util.Scanner;
public class LineTrip_1901A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] gasStationsCounts = new int[testCases];
        int[] destinationPoints = new int[testCases];
        int[][] gaseStationPoints = new int[testCases][];
        int[] minFuelVoulumes = new int[testCases];
        for(int i = 0 ; i < testCases; i++){
            int gsCount = sc.nextInt();
            gasStationsCounts[i] = gsCount;
            destinationPoints[i] = sc.nextInt();
            int[] gasPoints = new int[gsCount];
            for(int j =0; j<gsCount; j++){
                gasPoints[j] = sc.nextInt();
            }
            gaseStationPoints[i]=gasPoints;
        }

        for(int i = 0; i < testCases; i++){
            int g = gasStationsCounts[i];
            int x = destinationPoints[i];
            int[] stations = gaseStationPoints[i];
            int maxFuel = 0;
            int prev =0;
            for(int j = 0; j < g; j++){
                maxFuel=Math.max(maxFuel,stations[j]-prev);
                prev= stations[j];
            }
            maxFuel = Math.max(maxFuel,x-stations[g-1]);
            minFuelVoulumes[i]=maxFuel;
        }

        for(int max :  minFuelVoulumes){
            System.out.println(max);
        }


    }
}
