import java.util.Scanner;

public class Main {
    public static final String[] COMMANDS = new String[] {
            "/help", "/start", "/end", "/getLocation"
    };
    private static final String[] RES = new String[]{
            "", "Bot started!...", "Bot ended", "location is Rostov"
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = "commands available for this bot \n";
        for (String command : COMMANDS) {
            commands += command + "\n";
        }
        RES[0] = commands;
        String input;
        boolean found;
        while (true) {
            input = scanner.nextLine();
            found = false;
            for (int a = 0; a<COMMANDS.length; a++) {
                if (COMMANDS[a].equals(input)) {
                    System.out.println(RES[a]);
                    found = true;
                    break;
                }
            }
            if (COMMANDS[2].equals(input)) {
                break;
            }
            if(!found) {
                System.out.println("no command found for that. Try again " + COMMANDS[0]);
            }
        }
    }
}