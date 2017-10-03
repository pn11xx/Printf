

import javax.swing.JOptionPane;

public class Printf {
    /**
     * Purpose: Make user choose an option between println and printf
     * Use string using printf and %s format
     * Character using printf and %c format
     * Decimal using printf and %d format
     * Exponential using printf and %e format
     * Floating-point using printf and %f format
     * Make each line from println and printf output the same result to user
     * @param args
     */
    public static void main(String[]args) {
        String input = JOptionPane.showInputDialog(null, "Please choose between println and printf: ");
        if (input.equals("println")) {
            System.out.println("You have chosen 'println'.");
            System.out.println("You received an A");
            System.out.println("Your test score is 95");
            System.out.printf("Your score is 8.560000e+01");
            System.out.printf("Your GPA is 3.90");
        } else {
            System.out.printf("You have chosen %s \n", "'printf'");
            System.out.printf("You received an %c \n", 65);
            System.out.printf("Your test score is %d \n", 95);
            System.out.printf("Your score is %2e \n", 85.6);
            System.out.printf("Your GPA is %4.2f \n", 3.90);

        }
    }
}
