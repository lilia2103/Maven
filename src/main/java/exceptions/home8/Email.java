package exceptions.home8;

import java.util.Scanner;

public class Email {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an email address: ");
            String email = sc.nextLine();

            try {
                if (!isValidEmail(email)) {
                    throw new IllegalArgumentException("Invalid email address");
                }
                System.out.println("Valid email address");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            sc.close();
        }

        private static boolean isValidEmail(String email) {
            // Regular expression pattern for a valid email address
            String emailPattern = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";

            // Check if the email matches the pattern
            return email.matches(emailPattern);
        }
}
