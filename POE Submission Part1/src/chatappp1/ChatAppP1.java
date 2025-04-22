/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatappp1;

import java.util.Scanner;

public class ChatAppP1 {

    String username;
    String password;
    String cellPhone;

    public void registerUser() {
        
        Scanner register = new Scanner(System.in);

        //enter username until correct
        while (true) {
            System.out.println("Enter a username (must contain '_' and be no more than 5 characters): ");
            String inputUsername = register.nextLine();
            if (checkUsername(inputUsername)) {
                this.username = inputUsername;
                break;
            }
        }
        //enter password until correct
        while (true) {
            System.out.println("Enter a password (at least 8 characters, with a capital letter, a number, and a special character): ");
            String inputPassword = register.nextLine();
            if (checkPassword(inputPassword)) {
                this.password = inputPassword;
                break;
            }
        }
        //enter cell phone number until correct
        while (true) {
            System.out.println("Enter your cell phone number with the international code (e.g., +27831234567): ");
            String inputCellPhone = register.nextLine();
            if (checkCellPhone(inputCellPhone)) {
                this.cellPhone = inputCellPhone;
                break;
            }
        }

        System.out.println("You have been registered!");
        loginUser(register);
        register.close();
    }

    public boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
            return true;
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return false;
        }
    }

    public boolean checkPassword(String password) {
        boolean containsapitalLetter = password.matches(".*[A-Z].*");
        boolean containsNumber = password.matches(".*[0-9].*");
        boolean containsSpecialChar = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        boolean isLongEnough = password.length() >= 8;

        if (containsapitalLetter && containsNumber && containsSpecialChar && isLongEnough) {
            System.out.println("Password successfully captured.");
            return true;
        } else {
            System.out.println("Password is not correctly formatted, please ensure that your password is at least 8 characters long, contains a capital letter, a number, and a special character.");
            return false;
        }
    }

    public boolean checkCellPhone(String cellPhone) {
        if (cellPhone.startsWith("+")) {
            String numbersOnly = cellPhone.substring(1); // Remove '+'
            if (numbersOnly.matches("[0-9]+") && numbersOnly.length() == 11) {
                System.out.println("Cell phone number successfully added.");
                return true;
            }
        }
        System.out.println("Cell phone number incorrectly formatted or does not contain an international code.");
        return false;
    }

    public void loginUser(Scanner login) {
        
        while (true) {
        System.out.println("Login - Enter your username:");
        String loginUsername = login.nextLine();

        System.out.println("Login - Enter your password:");
        String loginPassword = login.nextLine();

        if (loginUsername.equals(this.username) && loginPassword.equals(this.password)) {
            System.out.println("Login successful. Welcome back to the app " + username +"!");
        } else {
            System.out.println("Login failed. Username or password incorrect.");
        }break;
        }
    }
    
        public static void main(String[] args) {
        ChatAppP1 app = new ChatAppP1();
        app.registerUser();
    }
}
