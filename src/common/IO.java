package common;

import java.util.Scanner;

public class IO {
    /**
     * retrieves input from stdin
     *
     * @param message message to be passed to the user concerning the input
     * @return user's input
     */
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message + " ");
        return scanner.nextLine().trim();
    }
}
