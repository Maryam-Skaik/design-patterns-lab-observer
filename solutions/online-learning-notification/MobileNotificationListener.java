package observerpattern;

/**
 * Concrete Observer (Mobile push notifications)
 */
public class MobileNotificationListener implements EventListener {

    private String username;

    public MobileNotificationListener(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println("MOBILE PUSH → " + username + " : " + message);
    }
}
