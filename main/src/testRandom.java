import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.*;

public class testRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int b = 0;
        int u = 0;
        Queue<String> questionsQueue = new LinkedList<>(); // queue of question
        Queue<String> answersQueue = new LinkedList<>(); // queue of question
        Queue<Integer> answCount = new LinkedList<>(); // queue of answers count
        //String[][] allAnswAllQuest = new String[1][60];  // array of all question and all answers
        String[][] allAnswAllQuest = new String[1][5];  // array of all question and all answers
        String[][] answersQuestions = new String[1][5]; // array of 1 question and 4 answers
        String[] questions = new  String[1]; // array of questions
        String[] answers = new String[4]; // array of answers

        test mainWindow = new test();
        // Упаковываем все элементы с нашей формы
        test.pack();
        // Изменяем размеры окна
        test.setSize(new Dimension(200, 200));
        // Отображаем созданное окно
        test.setVisible(true);

        class MyButtonListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField1.getText().equals(passwordField1.getText())) {
                    JOptionPane.showMessageDialog(null, "Success");
                } else {
                    JOptionPane.showMessageDialog(null, "Failure");
                }
            }
        }


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
        System.out.println("");
        i = 0;
        b = 0;

        int[] answersCount = new int[] {1, 2, 3, 4};
        for (i = 0; i <= answersQuestions[0].length; i++) {
            int j = (int) (Math.random()*4);
            for (b = 0; b <= 4; b++) {
                while (true){
                    int count = answersCount[b];
                    answCount.add(count);
                }
            }
            while (j <= 5) {
                allAnswAllQuest[0][j] = answersQuestions[0][j];
            }
        }

        /*for (i = 0; i <= answersQuestions[0].length; i++) {
            Random rnd = new Random();
            for (b = 0; b == 4; b++) {
                int j = rnd.nextInt(b);
                int temp = answersCount[b];
                answersCount[b] = answersCount[j];
                answersCount[j] = temp;
                answersQuestions[1][b] = answersQuestions[1][j];
                if (b == 4) {
                    break;
                }
            }
        }*/
        i = 0;
        b = 0;

        //for (b = 0; b <= answersQuestions.length; b++) {
            for (i = 0; i < 4; i++) {
                System.out.println(answersQuestions[0][i]);
            }
        //}
    }
}