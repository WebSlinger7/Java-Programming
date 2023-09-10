public class TestSimpleCircle {
    public static void main(String[] args) {
        
        //Create and object with radius 1
        circle circle1 = new circle();
        System.out.println("The area of circle1 of radius " + circle1.radius + " is " + circle1.getArea());

        circle circle2 = new circle(25);
        System.out.println("The area of circle2 of radius " + circle2.radius + " is " + circle2.getArea());
    }
}
