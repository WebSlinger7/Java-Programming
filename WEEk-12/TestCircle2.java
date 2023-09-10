public class TestCircle2 {
    public static void main(String[] args) {
        System.out.println("Before creating objects ");
        System.out.println("The number of objects are " + Circle2.numberOfobjects);

        //Create object1
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2();
        Circle2 c3 = new Circle2();
        c3.radius = 4; 
        System.out.println("\n After creating a circle object is " + Circle2.numberOfobjects);
        System.out.println("The area of circle3 is " + c3.getArea());
    }
}
