/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigngrades;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class AssignGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numStudents;
        int scores;
        int bestScore;

        System.out.println("Enter the number of students");
        numStudents = scan.nextInt();

        int[] scor = new int[numStudents];

        System.out.println("Enter scores ");
        for (int i = 0; i < scor.length; i++) {
            scor[i] = scan.nextInt();

        }
        int m = bestScore(scor);
        System.out.println("best is " + m);
        AssignGrades(m,scor);

    }

    public static int bestScore(int[] sc) {

        int best = sc[0];
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] > best) {
                best = sc[i];

            }
        }

        return best;
    }

    public static void AssignGrades(int best, int[] sc) {

        for (int i = 0; i < sc.length; i++) {
            if (sc[i] >= best - 10 ) {
                System.out.println("Student " + i + " score is " + sc[i] + " and grade is " + "A");

            } else if (sc[i] >= best - 20 ) {
                System.out.println("Student " + i + " score is " + sc[i] + " and grade is " + "B");

            } else if (sc[i] >= best - 30 ) {
                System.out.println("Student " + i + " score is " + sc[i] + " and grade is " + "C");
                
            }else if (sc[i] >= best - 40 ) {
                System.out.println("Student " + i + " score is " + sc[i] + " and grade is " + "D");
                
            }else  {
                System.out.println("Student " + i + " score is " + sc[i] + " and grade is " + "F");
            }
        }

    }
}
