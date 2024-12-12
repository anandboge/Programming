/*Gross Salary
In a company an emplopyee is paid as under: If his basic salary is less than Rs. 1500, then HRA = 10% of base 
salary and DA = 90% of basic salary.

If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary. 
If the Employee's salary is input, write a program to find his gross salary.

NOTE: Gross Salary = Basic Salary + HRA + DA

Input

The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an 
integer salary.

Output

For each test case, output the gross salary of the employee in a new line. Your answer will be 
considered correct if the absolute error is less than 10-2. 

Sample 1:

Input
3
1203
10042
1312

Output
2406.00
20383.16
2624*/

import java.util.Scanner;

public class GrossSalary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the basic salary
            double basicSalary = scanner.nextDouble();
            
            double hra, da, grossSalary;
            
            // Calculate HRA and DA based on the basic salary
            if (basicSalary < 1500) {
                hra = 0.10 * basicSalary;
                da = 0.90 * basicSalary;
            } else {
                hra = 500;
                da = 0.98 * basicSalary;
            }
            
            // Calculate gross salary
            grossSalary = basicSalary + hra + da;
            
            // Output the result, formatted to 2 decimal places
            System.out.printf("%.2f\n", grossSalary);
        }
    }
}