package observerpattern;

/**
 * Concrete Observer (Subscriber)
 *
 * This class represents a listener that receives notifications via EMAIL.
 *
 * It implements EventListener, meaning:
 * - It MUST define how it handles updates
 * - It becomes part of the Observer system
 */
public class EmailMessageListener implements EventListener {

    // Each listener has its own data (email address)
    private String email;

    /**
     * Constructor used to assign the email address of this subscriber
     */
    public EmailMessageListener(String email) {
        this.email = email;
    }

    /**
     * This method is called automatically by the publisher (NotificationService)
     * when an event happens.
     *
     * Instead of real email sending logic, we simulate it using print.
     *
     * In real systems, this could call:
     * - SMTP server
     * - Email API (SendGrid, etc.)
     */
    @Override
    public void update(String message) {
        System.out.println("Sending email to: " + email + " : " + message);
    }
}
