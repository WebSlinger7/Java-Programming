public class Rectangle {
    

    //Create Data fields;
    double height;
    double width;
    static int numberOfobjects = 0;

    Rectangle(){
        height = 1;
        width = 1;
        numberOfobjects++;
    }
    static int getnumberOfobjects(){
        return numberOfobjects;
    }
    double getArea(){
        return height * width;
    }
    double getPerimeter(){
        return (height + width) * 2;
    }
    
}
