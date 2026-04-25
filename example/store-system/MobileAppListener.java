package observerpattern;

/**
 * Concrete Observer (Subscriber)
 *
 * This class represents a listener that receives PUSH notifications
 * through a mobile application.
 *
 * It is another implementation of EventListener.
 *
 * This shows one of the key benefits of Observer Pattern:
 * → We can add new listener types WITHOUT changing existing code
 */
public class MobileAppListener implements EventListener {

    // Unique identifier for mobile user
    private String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    /**
     * Handles update notification from publisher
     *
     * In real systems, this could integrate with:
     * - Firebase Cloud Messaging (FCM)
     * - Apple Push Notification Service (APNS)
     */
    @Override
    public void update(String message) {
        System.out.println("Sending push notification to : " 
                + username + " : " + message);
    }
}
