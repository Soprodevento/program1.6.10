//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println(isGmailOrOutlook("kata12@gmail.com"));
    }
    public static boolean isGmailOrOutlook(String email) {
        return email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[com]{2,}$");
    }
}