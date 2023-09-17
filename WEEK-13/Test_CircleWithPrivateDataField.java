public class Test_CircleWithPrivateDataField {
    public static void main(String[] args) {
        CircleWithPrivateDataField mycircle = new CircleWithPrivateDataField(5.0);
        System.out.println("The area of the circle with " + mycircle.getRadius() + " is " + mycircle.getArea());
        mycircle.setRadius(mycircle.getRadius() * 1.1);
        System.out.println("The area of the circle with " + mycircle.getRadius() + " is " + mycircle.getArea());
        System.out.println("Number of Objects that are created = " + CircleWithPrivateDataField.getNumberOfObjects());
    }
}
