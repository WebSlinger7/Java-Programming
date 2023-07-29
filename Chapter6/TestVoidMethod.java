public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        PrintGrade(90.5);
    }
//This is my PrintGrade Method to print grade of students
public static void PrintGrade(double score){
    if (score >= 90){
        System.out.println("A");
    }
    else if (score >= 80){
        System.out.println("B");
    }
    else if (score >= 70){
        System.out.println("C");
    }
    else if (score >= 60){
        System.out.println("D");
    }
    else{
        System.out.println("F");
    }
}


}
