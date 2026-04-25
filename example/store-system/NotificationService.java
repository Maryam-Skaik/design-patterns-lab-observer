package observerpattern;

import java.util.*;

/**
 * This is the core of the Observer Pattern.
 *
 * It acts as the "Subject" or "Publisher".
 *
 * Responsibilities:
 * 1. Store all subscribers (listeners)
 * 2. Allow subscription (register observers)
 * 3. Allow unsubscription (remove observers)
 * 4. Notify all relevant observers when an event happens
 *
 * Important concept:
 * - The publisher does NOT know WHO the listeners are
 * - It only manages a list of listeners
 */
public class NotificationService {

    /**
     * Map structure:
     * Key → EventType (NEW_ITEM, SALE)
     * Value → List of listeners interested in that event
     *
     * This allows us to:
     * - Group listeners based on event type
     * - Send targeted notifications
     */
    private Map<EventType, List<EventListener>> listeners = new HashMap<>();

    /**
     * Constructor initializes empty lists for each event type
     *
     * Why?
     * → Ensures every event type has a ready list
     */
    public NotificationService() {
        for (EventType type : EventType.values()) {
            listeners.put(type, new ArrayList<>());
        }
    }

    /**
     * Subscribe (register observer)
     *
     * A listener is added to a specific event type
     */
    public void subscribe(EventType type, EventListener listener) {
        listeners.get(type).add(listener);
    }

    /**
     * Unsubscribe (remove observer)
     *
     * Removes listener from receiving future updates
     */
    public void unsubscribe(EventType type, EventListener listener) {
        listeners.get(type).remove(listener);
    }

    /**
     * Notify all subscribed listeners of a specific event type
     *
     * This is the MOST IMPORTANT part of the Observer Pattern:
     *
     * When an event happens:
     * → Loop through all observers
     * → Call their update() method
     *
     * This creates:
     * - Automatic communication
     * - Loose coupling
     */
    public void notify(EventType type, String message) {
        for (EventListener listener : listeners.get(type)) {
            listener.update(message);
        }
    }
}
