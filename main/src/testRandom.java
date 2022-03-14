import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class testRandom {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        int u = 0;
        Queue<String> questionsQueue = new LinkedList<>(); // queue of question
        Queue<String> answersQueue = new LinkedList<>(); // queue of question
        Queue<Integer> answCount = new LinkedList<>(); // queue of answers count
        //String[] allAnswAllQuest = new String[60];  // array of all question and all answers
        String[] allAnswAllQuest = new String[5];  // array of all question and all answers
        String[] answersQuestions = new String[5]; // array of 1 question and 4 answers
        String[] questions = new  String[1]; // array of questions
        String[] answers = new String[4]; // array of answers


        for () {
            Scanner scan = new Scanner(System.in);

            // question array + question Queue
            while (scan.hasNextLine()) {
                String question = scan.nextLine();
                i++;
                questions[b] = question; // array
                questionsQueue.add(question); // queue
                b++;
                if (i >= questions.length) {
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
                if (i == answers.length) {
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
            i = -1;
            b = 0;

            // array queue of answer and question
            for (i = 0; i <= answersQuestions.length; i++) {
                if (i == 0) {
                    answersQuestions[0] = questions[i];
                    allAnswAllQuest[0] = questions[i];
                } else if (i < 5) {
                    answersQuestions[i] = answers[b];
                    b++;
                }
            }
            i = 0;
            b = 0;

            // print array of answer and question
            for (b = 0; b < answersQuestions.length; b++) {
                if (b == 0) {
                    System.out.println();
                }
                System.out.println(answersQuestions[b] + ": ");
            }
            System.out.println("Second end");

            System.out.println("");
            i = 0;
            b = 0;

            int[] answersCount = new int[] {1, 2, 3, 4};
            Random rnd = new Random();
            for(i = 0; i < answersCount.length; i++) {
                int index = rnd.nextInt(1 + 1);
                int a = answersCount[index];
                answersCount[index] = answersCount[i];
                answersCount[i] = a;
            }
            i = 0;
            b = 0;
            for (i = 0; i < answersCount.length; i++) {
                System.out.println(answersCount[i]);
            }

            for (i = 1; i < 5; i++) {
                int index = answersCount[b];
                allAnswAllQuest[i] = answersQuestions[index];
                b++;
            }
            i = 0;
            b = 0;

            for (i = 0; i < allAnswAllQuest.length; i++) {
                System.out.println(i + ")" + allAnswAllQuest[i]);
            }

            i = 0;
            b = 0;
        }
    }
}