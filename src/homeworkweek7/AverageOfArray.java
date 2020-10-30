/*Write a Java program to calculate the average value of array
        elements*/
package homeworkweek7;

public class AverageOfArray {
    public static void main(String[] args) {
        double score[] = {420, 80, 100, 70, 40, 60, 30,200,500,1000};
        int i, sum, avg;
        sum = 0;
        for (i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = sum / score.length;
        System.out.println("The average of given score is : " + avg);
    }
}



