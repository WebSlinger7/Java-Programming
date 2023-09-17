public class ArrayofObjects {
    public static void main(String[] args) {
        CircleWithPrivateDataField [] CircleArray = new CircleWithPrivateDataField[5];
        System.out.println(CircleArray.length);
        for(int i = 0; i < CircleArray.length; i++){
            CircleArray[i] = new CircleWithPrivateDataField(Math.random()*10);
        }
        //Print CircleArray
        printCircleArray(CircleArray);
    }
    public static void printCircleArray(CircleWithPrivateDataField[]CircleArray){
        
        System.out.printf("%-30s%-15s\n");
        for(int i = 0; i<CircleArray.length; i++){
            System.out.printf("%-30s%-15s\n", CircleArray[i].getRadius(), CircleArray[i].getArea());
        }
    }
}
