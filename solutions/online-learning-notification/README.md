# 🧪 Activity: Online Learning Notification System - Solution

## 🎯 Objective

This solution demonstrates how to design a **scalable event-driven notification system** using the **Observer Pattern**.

The main goal is to ensure that:

* Course components do not directly depend on students
* Notifications are automatically triggered on events
* Students can subscribe/unsubscribe dynamically
* Multiple notification types are supported (email, mobile, etc.)
* The system remains **loosely coupled, extensible, and maintainable**

This eliminates manual notification handling and avoids tightly coupled course-student interactions.

---

## 🧠 Solution Explanation

### Step 1: Identified Main Components

* `Course` (Publisher / Subject trigger)
* `CourseNotificationService` (Observer manager)
* `EventListener` (Observer interface)
* `EmailNotificationListener` (Concrete observer)
* `MobileNotificationListener` (Concrete observer)
* `EventType` (Event categorization)
* `Main` (System execution / simulation)

---

## ⚠️ Step 2: Identified the Core Problem

Without the Observer Pattern:

* Courses would directly manage student notifications
* Each new notification type requires modifying course logic
* Students must manually check updates
* High coupling between course logic and communication logic
* Difficult to scale when adding new channels or features

### 💡 Key Insight

Course events and student notifications are **not the same responsibility**.

* Course → produces events
* Students → react to events

These should be decoupled completely.

---

## 🧩 Step 3: Introduced Event Abstraction

The system defines a central contract:

```java
void update(String message);
```

This is implemented by all observers.

### Concrete Observers:

* `EmailNotificationListener` → email-based updates
* `MobileNotificationListener` → push notifications

### Benefit:

New notification channels can be added without modifying existing system logic.

---

## 🧠 Step 4: Introduced Event Categorization

```java
EventType {
    NEW_LECTURE,
    NEW_ASSIGNMENT
}
```

### Why this matters:

* Enables filtering notifications by event type
* Students subscribe only to relevant updates
* Prevents unnecessary notifications
* Improves system scalability

---

## 🔄 Step 5: Applied Observer Pattern Structure

### Subject (Publisher)

`CourseNotificationService`

Responsible for:

* Storing subscribers
* Managing subscriptions/unsubscriptions
* Dispatching notifications

### Observer (Subscribers)

Students implementing `EventListener`

Responsible for:

* Receiving updates
* Handling messages based on channel type

### Flow:

1. Course triggers event
2. NotificationService identifies subscribers
3. All relevant observers are notified automatically

---

## 🧩 Step 6: Course Role (Publisher Trigger)

The `Course` class:

* Does NOT store students
* Does NOT know notification logic
* Only triggers events

### Responsibilities:

* `addLecture()` → triggers NEW_LECTURE event
* `addAssignment()` → triggers NEW_ASSIGNMENT event

### Key Design Principle:

> Course only emits events, it does not manage listeners.

---

## 🔔 Step 7: Notification Service Responsibilities

`CourseNotificationService` acts as the core observer manager:

### Responsibilities:

* Maintain a map of event → listeners
* Register observers per event type
* Remove observers dynamically
* Notify relevant observers only

### Core Structure:

```text
EventType → List<EventListener>
```

### Benefit:

* Enables targeted notifications
* Avoids broadcasting unnecessary messages
* Supports multiple event categories cleanly

---

## 🧾 Step 8: Role of Main Class

The `Main` class is the **composition root**, responsible for:

* Creating course instance
* Creating observers (students)
* Subscribing/unsubscribing students
* Triggering system events

### Example decisions:

* Student1 → Email only for lectures
* Student2 → Mobile for both lectures and assignments
* Student3 → Email for assignments only

---

## 🧩 UML Diagram Representation

```text
+----------------------+
|      EventListener   |
+----------------------+
| + update(message)    |
+----------------------+
          ▲
   ---------------------
   |                   |
+----------------+ +---------------------+
| EmailListener  | | MobileListener      |
+----------------+ +---------------------+
| update()       | | update()            |
+----------------+ +---------------------+
          ▲
          |
   subscribed to
          |
+---------------------------+
| CourseNotificationService |
+---------------------------+
| +subscribe()              |
| +unsubscribe()            |
| +notify()                 |
+---------------------------+
          ▲
          |
+----------------------+
|       Course         |
+----------------------+
| +addLecture()        |
| +addAssignment()     |
+----------------------+
          ▲
          |
       Main
```

---

## ⚙️ Step 9: Java Implementation Highlights

* Strong separation between event source and listeners
* Uses `Map<EventType, List<EventListener>>` for flexibility
* Supports runtime subscription changes
* No direct dependency between Course and Students
* Easy to extend with new observer types (SMS, Dashboard, etc.)

---

## 🧾 Example Execution Flow

```java
course.getNotificationService()
        .subscribe(EventType.NEW_LECTURE, student1Email);

course.getNotificationService()
        .subscribe(EventType.NEW_ASSIGNMENT, student2Mobile);

course.addLecture("Linked Lists Introduction");
course.addAssignment("Implement Linked List");
```

---

## 📌 Example Console Output

```text
EMAIL → student1@gmail.com : Course [Data Structures] New Lecture: Linked Lists Introduction
MOBILE PUSH → student2 : Course [Data Structures] New Lecture: Linked Lists Introduction

MOBILE PUSH → student2 : Course [Data Structures] New Assignment: Implement Linked List
EMAIL → student3@gmail.com : Course [Data Structures] New Assignment: Implement Linked List

--- After Unsubscribe ---

EMAIL → student1@gmail.com : Course [Data Structures] New Lecture: Stacks Implementation
```

---

## 🚀 Advantages of This Design

* Fully decoupled system (Course ↔ Students)
* Easy to add new notification channels
* Supports dynamic subscription/unsubscription
* Event-driven architecture improves scalability
* Clean separation of responsibilities
* Highly reusable and maintainable design

---

## 📌 Key Insight

This activity demonstrates the core idea of the **Observer Pattern**:

> One-to-many dependency where observers are automatically notified when the subject changes state.

It enables systems to:

* React automatically to events
* Stay loosely coupled
* Scale easily with new features

This pattern is widely used in real-world systems like:

* Event buses
* Messaging systems
* UI event handling
* Real-time notification platforms
