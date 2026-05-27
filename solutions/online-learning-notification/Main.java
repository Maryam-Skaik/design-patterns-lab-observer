package observerpattern;

/**
 * Entry point - simulation of system behavior
 */
public class Main {

    public static void main(String[] args) {

        // Create course (publisher)
        Course course = new Course("Data Structures");

        // Create observers (students)
        EventListener student1Email =
                new EmailNotificationListener("student1@gmail.com");

        EventListener student2Mobile =
                new MobileNotificationListener("student2");

        EventListener student3Email =
                new EmailNotificationListener("student3@gmail.com");

        // Subscriptions
        course.getNotificationService()
                .subscribe(EventType.NEW_LECTURE, student1Email);

        course.getNotificationService()
                .subscribe(EventType.NEW_LECTURE, student2Mobile);

        course.getNotificationService()
                .subscribe(EventType.NEW_ASSIGNMENT, student2Mobile);

        course.getNotificationService()
                .subscribe(EventType.NEW_ASSIGNMENT, student3Email);

        // Trigger events
        course.addLecture("Linked Lists Introduction");
        course.addAssignment("Implement Singly Linked List");

        // Unsubscribe example
        course.getNotificationService()
                .unsubscribe(EventType.NEW_LECTURE, student2Mobile);

        // Trigger again after unsubscribe
        course.addLecture("Stacks Implementation");
    }
}
