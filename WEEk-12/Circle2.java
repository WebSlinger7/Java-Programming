public class Circle2 {
    //Data field 
    double radius; 

    //The number of objects
    static int numberOfobjects = 0;

    Circle2(){
        radius = 1;
        numberOfobjects++;
    }
    static int getnumberOfobjects(){
        return numberOfobjects;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
}
