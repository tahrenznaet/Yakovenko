import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class testRandom {
    public static void main(String[] args) {
        Queue<String> questionsQueue = new LinkedList<>(); //
        Queue<String> answersQueue = new LinkedList<>(); //
        int i = 0;
        int b = 0;
        int u = 0;
        Scanner scan = new Scanner(System.in);
        String[][] allAnswAllQuest = new String[1][60];  // array of all question and all answers
        String[][] answersQuestions = new String[1][5]; // array of 1 question and 4 answers
        String[] questions = new  String[12]; // array of questions
        String[] answers = new String[12]; // array of answers

        // question array + question Queue
        while (scan.hasNextLine()) {
            String question = scan.nextLine();
            i++;
            questions[b] = question;
            questionsQueue.add(question);
            b++;
            if (i >=questions.length) {
                i = 0;
                b = 0;
                break;
            }
        }

        // question array print
        for (i = 0; i < questions.length; i++) {
            u++;
            System.out.println(u + ") " + questions[i]);
        }
        i = 0;
        b = 0;

        // question queue print
      //for(String pq : questionsQueue) {
      //    System.out.println(pq);
      //}
        System.out.println("--------------");


        while (scan.hasNextLine()) {
            String answer = scan.nextLine();
            i++;
            answers[b] = answer;
            answersQueue.add(answer);
            b++;
            System.out.println(answer);
            //System.out.println("------------");
            if (i >=answers.length) {
                i = 0;
                b = 0;
                break;
            }
        }

        // question queue print
      //for(String pq : answersQueue) {
      //   System.out.println(pq);
      //}
        // answer array print
        for (i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
        i = 0;
        b = 0;

        // create queue of answer and question
        for (i = 0; i < answersQueue.size(); i++){
            if (i == 5) {
                break;
            }
            if (i == 1) {
                answersQuestions[0][i] = questionsQueue.peek();
            } else {
                answersQuestions[0][i] = answersQueue.peek();
            }
        }
        i = 0;
        b = 0;

        // print queue of answer and question
        for (i = 0; i < answersQuestions.length; i++) {
            for (b = 0; b < answersQuestions[0].length; b++) {
                if (b == 0) {
                    System.out.println();
                }
                System.out.print(answersQuestions[i][b] + ": ");
            }
        }
        i = 0;
        b = 0;

        for (i = 0; i <= answersQuestions[1].length; i++) {
            for (b = 0; b <= answersQuestions[1].length - 1; b++) {

            }
        }
        i = 0;
        b = 0;
    }
}