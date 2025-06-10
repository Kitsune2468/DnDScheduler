package ui;

import java.util.Scanner;

public class PreLoginUI {
    String ERASE_SCREEN = "\u001b[H\u001b[2J";
    Scanner scanner = new Scanner(System.in);
    PostLoginUI postLoginUI;
    boolean active = true;

    public void run() {
        while(active) {
            System.out.print(ERASE_SCREEN);
            options();
            System.out.print("[Not Logged In] >>> ");

            String line = scanner.nextLine();
            if(line.equals("login")) {
                login();
            } else if(line.equals("register")) {
                register();
            } else if(line.equals("options")) {
                options();
            } else if(line.equals("quit")) {
                quit();
            } else {
                System.out.println("Invalid command, please try again. (Type \"options\" to display available commands.)\n");
            }
        }
    }

    public void login() {
        String username, password;
        System.out.println("Login:");
        System.out.print("Enter your username:\n   ");
        String line = scanner.nextLine();
        username = line.strip();
        System.out.print("Enter your password:\n   ");
        line = scanner.nextLine();
        password = line.strip();

         // TODO: Connect to server and login user, then run postLoginUI
        try {
            // Server connection & login here.

            postLoginUI = new PostLoginUI();
            postLoginUI.run(username);
        } catch (Exception e) {
            System.out.println("\nInvalid username or password. \n Returning to main menu.\n");
        }
    }

    public void register() {
        String username, password, email;

        System.out.println("Register:");
        System.out.print("Enter your username:\n   ");
        String line = scanner.nextLine();
        username = line.strip();
        System.out.print("Enter your password:\n   ");
        line = scanner.nextLine();
        password = line.strip();
        System.out.print("Enter your email:\n   ");
        line = scanner.nextLine();
        email = line.strip();

        // TODO: Connect to server and register a new user, then run postLoginUI
        try {
            // Server connection & user registration here.

            postLoginUI = new PostLoginUI();
            postLoginUI.run(username);
        } catch (Exception e) {
            System.out.println("\nInvalid username or password. \n Returning to main menu.\n");
        }
    }

    public void options() {
        System.out.println("Options: ");
        System.out.println("\t\"login\" - Log in to the D&D Scheduler.");
        System.out.println("\t\"register\" - Create a new account.");
        System.out.println("\t\"options\" - Show available options.");
        System.out.println("\t\"quit\" - Quit the program.");
    }

    public void quit() {
        System.out.println("Quitting program...");
        active = false;
    }
}
