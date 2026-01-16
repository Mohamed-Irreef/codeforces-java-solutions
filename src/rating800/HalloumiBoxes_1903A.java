package src.rating800;
import java.util.Scanner;
public class HalloumiBoxes_1903A {
    public static boolean isSort(int[] array){//Ascending Sort
        for(int i=1; i<array.length; i++){
            int prev = array[i-1];
            int cur = array[i];
            if(!(prev<=cur)){
                return false;
            }
        }
        return true;
    }
    public static void sub_reverse(int[] array,int start, int end){
        while (start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] nArray = new int[testCases];
        int[] kArray = new int[testCases];
        int[][] boxArray = new int[testCases][];

        for(int i=0;i<testCases;i++){
            int count = sc.nextInt();
            nArray[i] = count;
            kArray[i] = sc.nextInt();

            int[] boxes = new int[count];
            for(int j=0; j<count; j++){
                boxes[j] = sc.nextInt();
            }
            boxArray[i] = boxes;

        }


        for(int i=0;i<testCases;i++){
            int n = nArray[i];
            int k = kArray[i];
            int[] boxes = boxArray[i];
            if(k==1){
                continue;
            }
            int idx=1;
            while (!isSort(boxes) && idx<n){
                int cur = boxes[idx];
                int prev = boxes[idx-1];

                if(prev>cur){
                    int ptr1=idx-1;
                    int ptr2=idx-1;
                    while (prev>cur && ptr2<n){
                        prev=cur;

                        ptr2++;
                        if(ptr2-ptr1+1>=k){
                            break;
                        }
                        if(ptr2+1<n){
                            cur=boxes[ptr2+1];
                        }

                    }

                    if(ptr2-ptr1+1<=k){
                        sub_reverse(boxes,ptr1,ptr2);
                    }
                }
                if(idx==n-1){
                    idx=1;
                    continue;
                }
                idx++;
            }
        }


        for (int[] finalBox:boxArray){
            if(isSort(finalBox)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}

//OPTIMAL SOLUTION (Below code)
//import java.util.*;
//
//public class HalloumiBoxes {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt(); // Read the number of test cases
//        while (t-- > 0) {
//            long n = scanner.nextLong(); // Read the number of boxes
//            long k = scanner.nextLong(); // Read the maximum length of subarray that can be reversed
//            long[] a = new long[(int) n]; // Array to store the numbers on the boxes
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextLong(); // Read each number into the array
//            }
//
//            // Create a copy of the original array
//            long[] copy_a = Arrays.copyOf(a, a.length);
//            Arrays.sort(copy_a); // Sort the copied array in non-decreasing order

            // Check if the original array is already sorted or if k > 1
//            if (Arrays.equals(copy_a, a) || k > 1) {
//                System.out.println("YES"); // If true, print "YES"
//            } else {
//                System.out.println("NO"); // Otherwise, print "NO"
//            }
//        }
//        scanner.close();
//    }
//}

// Time Complexity (TC): O(nlogn) = O(100log2(100)) = 100*7 = 700
// Space Complexity (SC): O(n)