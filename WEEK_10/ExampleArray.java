public class ExampleArray {
    public static void main(String[] args) {
        double[]mylist = new double[10];
        //mylist[0] = 5.6;
        //mylist[1] = 6.6;
        //mylist[2] = 34.6;
        //mylist[3] = 45.6;
        //mylist[4] = 67.6;
        //mylist[5] = 5.6;
        //mylist[6] = 5.6;
        //mylist[7] = 5.6; 
        //mylist[8] = 5.6;
        //mylist[9] = 5.6;
        
        
        for(int i = 0; i < mylist.length; i++){
            mylist[i] = i + 3;
        }
        System.out.println(mylist[1]);
        System.out.println(mylist[2]);
        System.out.println(mylist[3]);
        System.out.println(mylist[4]);
        
        
        
        // this is the short way that you don't need to clarify the length
        //double [] mylist = {1.9, 2.5, 3.5, 56.7};
        //System.out.println(mylist.length);
    }
}
