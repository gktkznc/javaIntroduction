package polymorphismDemo;

public class EMailLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Logged to e-mail: " + message);
    }
}
