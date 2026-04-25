package observerpattern;

/**
 * This class represents the BUSINESS LOGIC layer (Publisher trigger).
 *
 * It does NOT manage listeners directly.
 * Instead, it delegates that responsibility to NotificationService.
 *
 * Role:
 * - Trigger events like "new item" or "sale"
 * - Notify subscribers indirectly
 */
public class Store {

    // Store depends on NotificationService (Publisher system)
    private NotificationService notificationService = new NotificationService();

    /**
     * Provides access to subscription system
     * so external code can subscribe/unsubscribe
     */
    public NotificationService getNotificationService() {
        return notificationService;
    }

    /**
     * Event: New item added to store
     *
     * When this happens:
     * → Notify all subscribers of NEW_ITEM event
     */
    public void newItem(String itemName) {
        notificationService.notify(
                EventType.NEW_ITEM,
                "New item available: " + itemName
        );
    }

    /**
     * Event: Sale happens
     *
     * Notifies all SALE subscribers
     */
    public void sale(String itemName) {
        notificationService.notify(
                EventType.SALE,
                "Sale on: " + itemName
        );
    }
}
