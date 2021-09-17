/* ZCrowell_Part2.java
 * Java I-P-O program - updated so that test scores are read FROM a text file ("scores.txt").
 * The Min, Max, and Avg scores are then found and output to a new text file ("testResults.txt").
 * Also removed an unused "Count" variable.
 * For CSCI 111 Section 002
 * Last edited December 17, 2020 by Zane Crowell
 */


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // declare variables
        double scoreArray[] = new double[5];    // array of 5 test scores
        double sum = 0.0;
        double avg;
        double min = 101.0;
        double max = 0.0;
        double[] resultsArray = new double[3];

        // set up scanner
        Scanner kb = new Scanner(System.in);

        // for loop - reads data from scores.txt into array
        File newScores = new File("scores.txt");

        Scanner outFile = new Scanner(newScores);
        outFile.useLocale(Locale.US);

        for (int i=0; i<scoreArray.length; i++) {
            scoreArray[i]= outFile.nextDouble();
        }

        // for loop - find sum of scoreArray
        for (int i=0; i<scoreArray.length; i++) {
            sum = sum + scoreArray[i];
        }

        // combine min and max loops:
        for (int i=0; i< scoreArray.length; i++) {
            if (scoreArray[i] < min) {
                min = scoreArray[i];
            }
            if (scoreArray[i] > max) {
                max = scoreArray[i];
            }
        }

        // calculate average score
        avg = (sum/scoreArray.length);

        // put min, max, & avg in resultsArray
        resultsArray[0] = min;
        resultsArray[1] = max;
        resultsArray[2] = avg;

        // output output min, max, and avg to new text file
        File results = new File("testResults.txt");
        PrintWriter fileOut = new PrintWriter(results);

        fileOut.println("The minimum test score is: " + resultsArray[0]);
        fileOut.println("The maximum test score is: " + resultsArray[1]);
        fileOut.printf("The average test score is: %.1f%n", resultsArray[2]);   // modified to use printf to format the avg
        fileOut.close();

    } // end method main()

} // end class Main

