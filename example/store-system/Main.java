package observerpattern;

/**
 * Entry point of the application
 *
 * This class simulates how the Observer Pattern works in real usage.
 *
 * Flow:
 * 1. Create store (publisher system)
 * 2. Create listeners (observers)
 * 3. Subscribe them to events
 * 4. Trigger events
 * 5. Observers automatically react
 */
public class Main {

    public static void main(String[] args) {

        // Create the publisher (Store)
        Store store = new Store();

        // Create observers (subscribers)
        EventListener emailListener =
                new EmailMessageListener("user1@gmail.com");

        EventListener mobileListener =
                new MobileAppListener("user2");

        // Subscribe observers to specific events
        store.getNotificationService()
                .subscribe(EventType.NEW_ITEM, emailListener);

        store.getNotificationService()
                .subscribe(EventType.SALE, mobileListener);

        // Trigger events
        store.newItem("iPhone 20");
        store.sale("Samsung TV");
    }
}
