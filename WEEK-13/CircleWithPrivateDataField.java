public class CircleWithPrivateDataField {
    //The Radius of the circle
    private double Radius = 1;
    //The number of objects
    private static int numberOfObjects = 0;
    //Constructor
    public CircleWithPrivateDataField(){
        numberOfObjects++;

    }
    //Constructor with arguments
    public CircleWithPrivateDataField(double newRadius){
        Radius = newRadius;
        numberOfObjects++;
    }

    //Return the radius
    public double getRadius(){
        return Radius;
    }

    //Set the radius value
    public void setRadius(double newRadius){
        Radius = newRadius;
    }
    //Return the numberOfObjects
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    //Return area of circle
    public double getArea(){
        return Radius * Radius * Math.PI;
    }
}
