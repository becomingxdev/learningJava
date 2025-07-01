// Programing Challenge 2: Email Extracter
public class EmailExtractor {
    public static void main(String[] args) {
        
        String email = "your.name@example.com";
        int positionOfAt = email.indexOf("@");
        String userName = email.substring(0, positionOfAt);
        String domainName = email.substring(positionOfAt + 1);

        System.out.println("Username: " + userName);
        System.out.println("Domain: " + domainName);
    }
}