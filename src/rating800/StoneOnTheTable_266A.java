package src.rating800;
import java.util.Scanner;
public class StoneOnTheTable_266A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String stones =sc.nextLine();
        int removal=0;
        if(stones.length()<=1){
            System.out.println(removal);
            System.exit(0);
        }
       char prev = stones.charAt(0);
        for(int i=1;i<stones.length();i++){
            if(prev==stones.charAt(i)){
                removal++;
            }else {
                prev=stones.charAt(i);
            }
        }
        System.out.println(removal);
    }
}
//n-->Sized string
// Step0 - if the string.length == 1; then i will stop here and print 0 removals;
// Step1 - convert those string into charArray,
////prev =charArr[0];
// Step2 - start a for loop (1, length of charArray)
// if (prev == i) then we have to increment removal++; continue;
//else{prev=i}
//Step 3 - outside the loop, print the removal count;