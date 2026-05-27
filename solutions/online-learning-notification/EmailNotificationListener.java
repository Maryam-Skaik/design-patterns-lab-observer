package observerpattern;

/**
 * Concrete Observer (Email channel)
 *
 * Receives course updates via email.
 */
public class EmailNotificationListener implements EventListener {

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("EMAIL → " + email + " : " + message);
    }
}
