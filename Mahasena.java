/*Mahasena

Kattapa, as you all know was one of the greatest warriors of his time. The kingdom of Maahishmati had never lost a 
battle under him (as army-chief), and the reason for that was their really powerful army, also called as Mahasena.

Kattapa was known to be a very superstitious person. He believed that a soldier is "lucky" if the soldier is 
holding an even number of weapons, and "unlucky" otherwise. He considered the army as "READY FOR BATTLE" if the count of "lucky" soldiers is strictly greater than the count of "unlucky" soldiers, and "NOT READY" otherwise.

Given the number of weapons each soldier is holding, your task is to determine whether the army formed by all 
these soldiers is "READY FOR BATTLE" or "NOT READY".

Note: You can find the definition of an even number here.

Input Format

The first line of input consists of a single integer N denoting the number of soldiers. The second line of input 
consists of N space separated integers A1, A2, ..., AN, where Ai denotes the number of weapons that the ith soldier is holding.

Output Format

Generate one line output saying "READY FOR BATTLE", if the army satisfies the conditions that 
Kattapa requires or "NOT READY" otherwise (quotes for clarity). 

Sample 1:
Input
1
1

Output
NOT READY*/

import java.util.Scanner;

public class Mahasena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of soldiers
        int N = scanner.nextInt();
        int[] weapons = new int[N];
        
        // Input the number of weapons each soldier is holding
        for (int i = 0; i < N; i++) {
            weapons[i] = scanner.nextInt();
        }
        
        int luckyCount = 0;  // Count of soldiers with even number of weapons
        int unluckyCount = 0; // Count of soldiers with odd number of weapons
        
        // Count lucky and unlucky soldiers
        for (int weapon : weapons) {
            if (weapon % 2 == 0) {
                luckyCount++;
            } else {
                unluckyCount++;
            }
        }
        
        // Determine if the army is ready for battle
        if (luckyCount > unluckyCount) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
    }
}