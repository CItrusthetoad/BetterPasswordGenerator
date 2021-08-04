import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password Generator");
        System.out.println("0. Mass Generation (100 Passwords)");
        System.out.println("1. Specific Password (Enter your platform and character count)");
        System.out.println("2. Quit");

        int choice = scan.nextInt();

        while (choice != 2) {
            if (choice == 0) tester();
            if (choice == 1) manualEntry();
            if (!(choice == 0 || choice == 1)) System.out.println("ERROR: Invalid Response");

            System.out.println("0. Mass Generation (100 Passwords)");
            System.out.println("1. Specific Password (Enter your platform and character count)");
            System.out.println("2. Quit");
            choice = scan.nextInt();
        }
    }

    private static void tester() {
        String[] platforms = {"Google", "Twitter", "Facebook", "Instagram", "Linkedin", "Reddit"};
        Random r = new Random();
        ArrayList<Password> password = new ArrayList<>();
        System.out.println("REMEMBER: The platform names don't mean anything, just placeholders.");
        // Fuck this for loop for giving me hours of pain and suffering. :D
        for (int i = 0; i < 100; i++) {
            Generator generator = new Generator(); // This was needed to solve my problems. If messy, too bad!
            Password paw = generator.generate(10, platforms[r.nextInt(platforms.length)]);
            password.add(paw);
            // Paw is quite a weird name for this. Why not call it pw?
        }
        System.out.println("--------------------------------");
    }

    private static void manualEntry() {
        // This is the way you manually input your info for a password.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of characters");
        int count = scan.nextInt();
        System.out.println("Enter a platform");
        String platform;
        platform = scan.next();
        Generator generator = new Generator();
        generator.generate(count, platform);
        System.out.println("--------------------------------");
    }
}
