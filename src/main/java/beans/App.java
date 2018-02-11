package beans;

/**
 * Created by N on 11.02.2018.
 */
public class App {

    private Client client;
    private EventLogger eventLogger;

    public void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client("1", "jhon Smith");
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("something happened with 1");
    }
}
