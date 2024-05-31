package polymorphismDemo;

public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers = {new FileLogger(), new EMailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//
//        for(BaseLogger logger: loggers) {
//            logger.log("Log Mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
