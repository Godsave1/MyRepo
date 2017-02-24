/**This program reads a series of scores into and array and returns the highest and lowest scores. 
The program also alerts the user when they enter a new high or low score.
*/
import java.util.Scanner;
import java.util.Arrays;
public class MyArrays {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        int arraySize;
        int recordBroken = 0;
        System.out.print("Enter the number of games played in one season: ");
        arraySize = input.nextInt();
        int [] array = new int[arraySize];
        System.out.println("Enter first game score: ");
        array[0] = input.nextInt();
        for (int i = 1; i < arraySize; i++) {
            array[i] = input.nextInt();
            if(array[i] > array[i - 1]) {
                System.out.println("New Record!!");
                recordBroken++;
            }
            else if(array[i - 1] > array[i]) {
               System.out.println("New Least Score!");
            }
        }
        for(int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        System.out.println("Number of games : "+ array.length+"\nBroke Record: " + recordBroken + " time(s)");
        Arrays.sort(array);
        System.out.println("Max score: " + array[arraySize-1]+ "\nMin Score: " + array[0]);
    }
}
