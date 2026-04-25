package observerpattern;

/**
 * This enum defines all possible types of events
 * that can happen in the system.
 *
 * Why do we use Enum?
 * - To avoid using string values (safer and cleaner)
 * - To define a fixed set of event categories
 *
 * In real systems, events could be:
 * - NEW_ITEM → when a product is added
 * - SALE → when a discount happens
 */
public enum EventType {
    NEW_ITEM,
    SALE
}
