public class ArrayLargestElement {
    public static void main(String[] args) {
        //Creat an array
        float [] mylist = new float[5];

        for(int i = 0; i < mylist.length; i++){
            mylist[i] = (float)Math.random()*10;
        }
        for(int i = 0; i < mylist.length; i++){
            System.out.println(mylist[i] + "");
        }

        // Find the largest number
        float max = mylist[0];
        int indexOfMax = 0;


         for(int i = 0; i < mylist.length; i++){
            if(mylist[i]>max){
                max= mylist[i];
                indexOfMax = i;
            }

         }
         System.out.println("Largest element in the array is " + max);
         System.out.println("Index of first max values is "  + indexOfMax);
    }

}
