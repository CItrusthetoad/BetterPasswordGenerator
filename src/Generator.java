import java.util.Random; // Needed for the 'seed', which will generate the characters.

public class Generator {
    // Lists for all of the different character options.
    int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    String[] special = {"!", "@", "#", "$", "%", "&", "*"};
    String finalString = "";
    Random rand = new Random(); // Important for generating numbers (no shit)

    // This method is very crucial to the project. It takes in parameters (in this instance from the Main file).
    // Then, it generates a random number from 0 to 4. Lastly, we get a series of checks that determine a lowercase,
    // letter, uppercase letter, a number, or a symbol.
    public Password generate(int numOfChars, String platform) {
        for (int i = 0; i < numOfChars; i++) {
            int seed = rand.nextInt(4);

            if (seed == 0) finalString += alphabet[rand.nextInt(alphabet.length - 1)];
            else if (seed == 1) finalString += alphabetUpper[rand.nextInt(alphabetUpper.length - 1)];
             else if (seed == 2) finalString += special[rand.nextInt(special.length - 1)];
            else finalString += numbers[rand.nextInt(numbers.length - 1)];
        }

        // To actually get the information into the project.
        Password pw = new Password(platform, finalString);
        System.out.println(pw);
        return pw;
    }


}
