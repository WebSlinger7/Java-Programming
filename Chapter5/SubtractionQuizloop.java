import java.util.Scanner;
public class SubtractionQuizloop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0; // Count the correct questions
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = "";

        Scanner input = new Scanner (System.in);

        while(count < NUMBER_OF_QUESTIONS){
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);

            // Make sure number1 is greater than number2
            if(number1<number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            // Prompt the student to answer
            System.out.println("What is " + number1 + " - " + number2 + " ? ");
            int answer = input.nextInt();

            // Grade the student
            if(number1-number2 == answer){
                System.out.println("You are correct!\n");
                correctCount++;
            }
            else{
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1-number2) + "\n");
            }
            count++;
            
            output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer)? "correct" : "wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime);

    }
}
