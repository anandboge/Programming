/*Email Reminders
MoEngage helps the Chef send email reminders about rated contests to the participants.

There are a total of N participants on Chef’s platform, and U of them have told Chef not to send emails to them.

If so, how many participants should MoEngage send the contest emails to?

Input Format
The first and only line of input will contain a single line containing two space-separated integers N (the total number of users) and 
U (the number of users who don't want to receive contest reminders).

Output Format
Output in a single line, the number of users MoEngage has to send an email to.


 
Sample 1:
Input
100 7

Output
93 */

import java.util.Scanner;

public class EmailRemainders {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of users and the number of users who opted out
        int N = scanner.nextInt();  // Total participants
        int U = scanner.nextInt();  // Users who opted out
        
        // Calculate the number of users who should receive emails
        int result = N - U;
        
        // Output the result
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
    }
}
