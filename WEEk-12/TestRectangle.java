public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        rec1.height = 3.5;
        rec2.height = 35.9;
        rec1.width = 4;
        rec2.width = 40;
        System.out.println("After creating rectangle: the object is " + Rectangle.numberOfobjects);
         System.out.println("The height of rectangle1 and rectangle2 are " + rec1.height + " and " + rec2.height);
         System.out.println("The width of rectangle1 and rectangle2 are " + rec1.width + " and " + rec2.width);
         System.out.println("The area of rectangle1 and rectangle2 are " + rec1.getArea() + " and " + rec2.getArea());
         System.out.println("The Perimeter of rectangle1 and rectangle2 are " + rec1.getPerimeter() + " and " + rec2.getPerimeter());
    }
}
