import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int[] mylist = {1,4,7,56,78,123,134,245};
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number: ");
        int i = input.nextInt();
         i = binarysearch(mylist, 1);
        System.out.println("The index of key is " + i);
    }

    public static int binarysearch(int[] list, int key){
        int high = list.length-1;
        int low = 0;
        while(high>=low){
            int mid = (high+low)/2;
            if(key<list[mid]){
                high = mid-1;
            }
            else if(key == list[mid]){
                return mid;
            }
            else
            low = mid +1;
        }
        return -low -1;
    }
}
