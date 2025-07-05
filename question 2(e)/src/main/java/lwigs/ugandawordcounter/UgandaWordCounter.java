/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lwigs.ugandawordcounter;

/**
 *
 * @author Lwigs
 */
import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt librarian to enter the book description
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();

        // Convert description to lowercase to ensure case-insensitive matching
        String lowerDescription = description.toLowerCase();

        // Define the target word in lowercase
        String targetWord = "uganda";

        // Split the description into words using whitespace and punctuation as delimiters
        String[] words = lowerDescription.split("\\W+");

        int count = 0;

        // Count occurrences of "uganda"
        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }

        // Output the result
        System.out.println("The word \"Uganda\" appears " + count + " time(s) in the description.");

        scanner.close();
    }
}

