import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        int u = 0;
        Scanner scan = new Scanner(System.in);
        String[][] allAnswAllQuest = new String[1][60];
        String[][] answersaQuestions = new String[1][4]; // array of 1 question and 4 answers
        String[] questions = new  String[12]; // array of questions
        String[] answers = new String[12]; // array of answers

        // question array start
        while (scan.hasNextLine()) {
            String question = scan.nextLine();
            i++;
            questions[b] = question;
            b++;
            if (i >=questions.length) {
                i = 0;
                b = 0;
                break;
            }
        }

        // question array print
        for (int q = 0; q < questions.length; q++) {
            u++;
            System.out.println(u + ") " + questions[q]);
        }
        System.out.println("--------------");

        while (scan.hasNextLine()) {
            String answer = scan.nextLine();
            i++;
            answers[b] = answer;
            b++;
            System.out.println(answer);
            //System.out.println("------------");
            if (i >=answers.length) {
                i = 0;
                b = 0;
                break;
            }
        }
        for (int q = 0; q < answers.length; q++) {
            System.out.println(answers[q]);
        }


    }
}
