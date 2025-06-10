package ui;

import java.util.Scanner;

public class PostLoginUI {
    String ERASE_SCREEN = "\u001b[H\u001b[2J";
    boolean loggedIn = false;
    Scanner scanner = new Scanner(System.in);

    public void run(String username) {
        loggedIn = true;

        System.out.print("\nLogged in!");
        while(loggedIn) {
            System.out.print(ERASE_SCREEN);

            System.out.print(username+" >>> ");
            String line = scanner.nextLine();
            
            //Login stuff
        }
    }
}
