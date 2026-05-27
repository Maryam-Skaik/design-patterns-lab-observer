package observerpattern;

/**
 * Defines all possible events in the Course system.
 *
 * We use Enum to:
 * - Avoid string-based errors
 * - Keep event types strict and centralized
 */
public enum EventType {
    NEW_LECTURE,
    NEW_ASSIGNMENT
}
