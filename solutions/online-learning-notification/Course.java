package observerpattern;

/**
 * Business layer (Publisher trigger)
 *
 * Represents a course that generates events.
 */
public class Course {

    private String courseName;
    private CourseNotificationService notificationService =
            new CourseNotificationService();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public CourseNotificationService getNotificationService() {
        return notificationService;
    }

    /**
     * Event: New lecture added
     */
    public void addLecture(String lectureTitle) {
        notificationService.notify(
                EventType.NEW_LECTURE,
                "Course [" + courseName + "] New Lecture: " + lectureTitle
        );
    }

    /**
     * Event: New assignment published
     */
    public void addAssignment(String assignmentTitle) {
        notificationService.notify(
                EventType.NEW_ASSIGNMENT,
                "Course [" + courseName + "] New Assignment: " + assignmentTitle
        );
    }
}
