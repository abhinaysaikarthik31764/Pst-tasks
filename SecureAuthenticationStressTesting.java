import java.util.Scanner;

public class SecureAuthenticationStressTesting {
    static boolean isValid(String username, String password) {
        return username.length() >= 3 && username.length() <= 20
                && password.length() >= 6 && password.length() <= 20
                && username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();
            System.out.println(isValid(username, password) ? "SUCCESS" : "FAILURE");
        }
        sc.close();
    }
}
