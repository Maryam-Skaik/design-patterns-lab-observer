package observerpattern;

/**
 * Core Observer interface.
 *
 * Any student notification channel must implement this.
 */
public interface EventListener {

    /**
     * Called when a course event occurs.
     *
     * @param message notification content
     */
    void update(String message);
}
