public class Test_PassObject {
    public static void main(String[] args) {
        //Create a circle with radius 1
        CircleWithPrivateDataField myCircle = new CircleWithPrivateDataField(1);

        //Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle, n);


        
    }

    public static void printAreas(CircleWithPrivateDataField new_myCircle, int new_n){
        System.out.println("Radius\t\tArea");
        while(new_n >= 1){
            System.out.println(new_myCircle.getRadius() + 1);
            new_n--;
        }
    }
}
