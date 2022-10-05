package oopWithNLayereApp.core.loging;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("email sent: " + data);

    }
}
