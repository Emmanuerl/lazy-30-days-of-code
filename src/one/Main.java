package one;

import common.IO;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = IO.getInput("Hello, What's your name?");
        // check for special characters
        boolean isValidInput = isAlphanumeric(input);

        if (!isValidInput) {
            System.out.println("Please remove all spaces or special characters");
            return; // System.exit() can also be used here
        }

        List<String> recognizedNames = Arrays.asList("bolu", "odun");
        boolean isRecognizedName = recognizedNames.contains(input.toLowerCase());

        String salutation = isRecognizedName ? "Welcome back" : "It is nice to meet you";
        System.out.printf("%s, %s%n", salutation, input);
    }

    /**
     * checks if a given input contains alphanumeric characters only
     * @param input input to be tested
     * @return true if valid
     */
    static boolean isAlphanumeric(String input) {
        final Pattern regex = Pattern.compile("[a-z\\d]*", Pattern.CASE_INSENSITIVE);
        return regex.matcher(input).find();
    }
}
