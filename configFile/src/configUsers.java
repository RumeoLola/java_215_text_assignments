public class configUsers {
    // Create a java.io.File object for the file "errorLog.txt"
    java.io.File file = new java.io.File("errorLog.txt");
    // Get the size of the file in bytes and assign it to the variable 'size'
    size = (int) file.length();

    public static void main(String[] args) {
        configFile = new java.io.File("userSettings.cfg");
        exists = configUsers.exists();
    }
}
