package observerpattern;

import java.util.*;

/**
 * Core Subject (Publisher system)
 *
 * Responsible for:
 * - Managing subscribers
 * - Subscribing/unsubscribing listeners
 * - Notifying listeners when events occur
 */
public class CourseNotificationService {

    private Map<EventType, List<EventListener>> listeners = new HashMap<>();

    public CourseNotificationService() {
        for (EventType type : EventType.values()) {
            listeners.put(type, new ArrayList<>());
        }
    }

    /**
     * Subscribe a student to a specific event type
     */
    public void subscribe(EventType type, EventListener listener) {
        listeners.get(type).add(listener);
    }

    /**
     * Unsubscribe a student from a specific event type
     */
    public void unsubscribe(EventType type, EventListener listener) {
        listeners.get(type).remove(listener);
    }

    /**
     * Notify all subscribers of an event
     */
    public void notify(EventType type, String message) {
        for (EventListener listener : listeners.get(type)) {
            listener.update(message);
        }
    }
}
