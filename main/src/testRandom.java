import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class testRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int b = 0;
        int u = 0;
        Queue<String> questionsQueue = new LinkedList<>(); // queue of question
        Queue<String> answersQueue = new LinkedList<>(); // queue of question
        String[][] allAnswAllQuest = new String[1][60];  // array of all question and all answers
        String[][] answersQuestions = new String[1][5]; // array of 1 question and 4 answers
        String[] questions = new  String[1]; // array of questions
        String[] answers = new String[4]; // array of answers

        // question array + question Queue
        while (scan.hasNextLine()) {
            String question = scan.nextLine();
            i++;
            questions[b] = question; // array
            questionsQueue.add(question); // queue
            b++;
            if (i >=questions.length) {
                System.out.println("First end");
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


        // answer array + answer Queue
        while (scan.hasNextLine()) {
            String answer = scan.nextLine();
            i++;
            answers[b] = answer; // array
            answersQueue.add(answer); // queue
            b++;
            if (i >=answers.length) {
                System.out.println("Second end");
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

        // array queue of answer and question
        for (i = 0; i < answersQueue.size(); i++){
            if (i == 1) {
                answersQuestions[0][i] = questionsQueue.peek();
            } else if (i < 5){
                answersQuestions[0][i] = answersQueue.peek();
            } else {
                break;
            }
        }
        i = 0;
        b = 0;

        // print array of answer and question
        for (i = 0; i < answersQuestions.length; i++) {
            for (b = 0; b < answersQuestions[0].length; b++) {
                if (b == 0) {
                    System.out.println();
                }
                System.out.println(answersQuestions[i][b] + ": ");
            }
        }
        i = 0;
        b = 0;

        int[] answersCount = new int[] {1, 2, 3, 4};
        for (i = 0; i <= answersQuestions[0].length; i++) {
            Random rnd = new Random();
            for (b = 1; b < 4; b++) {
                int j = rnd.nextInt(b);
                int temp = answersCount[b];
                answersCount[b] = answersCount[j];
                answersCount[j] = temp;
                if (b == 4) {
                    break;
                }
            }
        }
        i = 0;
        b = 0;

        for (i = 0; i <= answersCount.length; i++) {
            System.out.println(answersCount);
        }
    }
}