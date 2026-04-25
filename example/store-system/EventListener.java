package observerpattern;

/**
 * This is the core interface of the Observer Pattern.
 *
 * In the Observer Pattern terminology:
 * - This represents the "Observer" (Subscriber)
 *
 * Any class that wants to receive updates must implement this interface.
 *
 * Why do we use an interface here?
 * - It allows us to define a common contract for all listeners
 * - It enables polymorphism (we can treat all listeners the same way)
 * - It decouples the publisher from concrete implementations
 *
 * The publisher does NOT know:
 * - Who the listeners are
 * - What type they are (Email, Mobile, etc.)
 *
 * It only knows that they can be "updated".
 */
public interface EventListener {

    /**
     * This method is called when an event happens in the system.
     *
     * @param message the notification message sent by the publisher
     *
     * Each observer will define HOW it handles the message:
     * - Email listener → sends email
     * - Mobile listener → sends push notification
     */
    void update(String message);
}
