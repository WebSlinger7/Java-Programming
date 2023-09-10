public class GradeExam {
    public static void main(String[] args) {
        

        //Student answers
        char[][] answers = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        //Key to answers
        char [] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //Grade all answers
        for(int row = 0; row < answers.length; row++){
            //Grade one student
            int correctAnswers = 0;
            for(int col = 0; col < answers[row].length; col++){
                if(answers[row][col] == keys[col]){
                    correctAnswers++;           
                }
            }
            System.out.println("Student " + row + "'s correct answers are   " + correctAnswers);
        }
        
    }
}
