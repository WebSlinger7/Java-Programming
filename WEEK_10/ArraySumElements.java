public class ArraySumElements {
    public static void main(String[] args) {
        //Creat an array
        double[] mylist = new double[5];

        //Initialize array with random variables
        for(int i = 0; i < mylist.length; i++){
            mylist[i] = Math.random()*10;      
        }
        //Summing all the elements
        double total = 0;
        for(int i = 0; i < mylist.length; i++){
            System.out.print(mylist[i] + " ");
            total = total + mylist[i];
            //total += mylist[i];
        }
        System.out.printf("\nSum of all elements is %5.2f ",total);

    }
}
