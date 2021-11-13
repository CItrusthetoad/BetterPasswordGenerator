public class Password {
    // Instance Variables
    String platform;
    String password;

    public Password(String platform, String password) {
        this.platform = platform;
        this.password = password;
    }

    public String toString() {
        return "Password for " + platform + ": " + password;
    }

    // I had getters, but they weren't used and the warning thing was annoying, so I deleted them.
    // I have no other warnings (besides those i disabled because Intellij).
    // My apologies.
}
