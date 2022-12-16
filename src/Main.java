import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Console cons = System.console();
        Boolean stop = false;
        System.out.println("Welcome.");
        while (!stop) {

            String line = cons.readLine("> ");
            line = line.trim();
            String[] command = line.split(" ");
            int last;

            int result;
            switch (command[1]) {

                // performs addition between numbers
                case "+":
                    result = Integer.parseInt(command[0]) + Integer.parseInt(command[2]);
                    System.out.println(result);
                    break;

                // performs subtraction between numbers
                case "-":
                    result = Integer.parseInt(command[0]) - Integer.parseInt(command[2]);
                    System.out.println(result);
                    break;

                // performs multiplication between numbers
                case "*":
                    result = Integer.parseInt(command[0]) * Integer.parseInt(command[2]);
                    System.out.println(result);
                    break;

                // performs division between numbers
                case "/":
                    result = Integer.parseInt(command[0]) / Integer.parseInt(command[2]);
                    System.out.println(result);
                    break;

                case "exit":
                    stop = true;
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        }
        System.out.println("Bye Bye");
    }
}