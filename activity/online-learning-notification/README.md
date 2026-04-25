# 🧪 Activity 1: Online Learning Notification System (Observer Pattern)

## 🎯 Objective

Design a scalable event-driven system using the **Observer Pattern** to manage notifications in an online learning platform.

---

## 📌 Scenario

You are building an **online learning platform** where instructors and students interact through courses.

In this system:

- Instructors upload:
  - New lectures  
  - Assignments  
- Students are enrolled in different courses  
- Each student may want to receive updates differently (email, mobile app, etc.)

---

## ⚠️ Problem Context

Without a proper design:

- Students must manually check course updates  
- Instructor must handle notifications manually  
- System becomes tightly coupled and hard to scale  
- Adding new notification types requires modifying existing logic  

This leads to:

- Repeated code  
- Poor scalability  
- High maintenance cost  

---

## 🧠 Your Task

- Design a **Course Notification System** using the **Observer Pattern**
- Decouple instructors (event source) from students (listeners)
- Allow dynamic subscription and unsubscription of students
- Ensure notifications are automatically triggered on updates

---

## 📏 Requirements

Your system must support:

- A **Course (Publisher / Subject)** that manages updates  
- **Students (Observers)** who receive notifications  
- Students can:
  - Subscribe to a course  
  - Unsubscribe from a course  
- Support multiple event types:
  - New lecture added  
  - Assignment published  
- Only subscribed students should receive updates  

---

## 🧩 Design Expectations

Your design should:

- Separate **event source** from **event consumers**
- Support **one-to-many communication**
- Allow runtime subscription changes
- Avoid direct dependency between Course and Students
- Be easily extensible for new notification types

---

## ✅ Expected Outcome

- A flexible notification system for courses  
- Reduced coupling between system components  
- Easy addition of new observer types (e.g., mobile, email, dashboard)  
- Clean and scalable event-driven architecture  

---

## 🚀 Example Use Case (Conceptual)

A student should be able to:

- Subscribe to a course  
- Receive updates automatically when:
  - A new lecture is added  
  - An assignment is posted  
- Stop receiving updates by unsubscribing  

Focus on **design clarity and behavior flow**, not implementation details.

---

## 🧩 Challenge Extension (Optional)

- How would you support different notification channels (Email, SMS, Push)?  
- How can you filter notifications per student preference?  
- How would you extend this system for multiple courses per student?  
- What changes are needed to support priority-based notifications?  

---

## 📌 Key Insight

This activity demonstrates how the **Observer Pattern** enables **event-driven communication**, allowing systems to react to changes automatically while staying loosely coupled and highly scalable.
