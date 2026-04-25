# 🧠 Design Patterns Lab — Observer Pattern

![Java](https://img.shields.io/badge/Language-Java-blue)
![Pattern](https://img.shields.io/badge/Pattern-Observer-green)
![Level](https://img.shields.io/badge/Level-Intermediate-orange)
![Focus](https://img.shields.io/badge/Focus-Event%20Driven%20Design%20%26%20Decoupling-purple)

---

## 🎥 Lecture Video

This repository accompanies the lecture on the **Observer Pattern**, focusing on real-world event-driven systems and decoupled communication between objects.

▶️ Watch on YouTube:  

[Lecture Video](https://youtu.be/GS5o9LXlTKk)

---

## 📌 About This Repository

This repository explains the **Observer Pattern** through practical backend scenarios and structured learning examples.

The goal is to help you:
- Understand object communication in real systems
- Build event-driven architectures
- Reduce coupling between components
- Design scalable notification systems

---

## 🔄 Why Observer Pattern?

In real applications, systems are constantly reacting to changes.

Common needs:
- Notifications when data changes
- Real-time updates
- Event-based workflows

Without proper design:
- Tight coupling increases
- Systems become hard to extend
- Notification logic gets duplicated

---

## ⚠️ Problem in Real Systems

When multiple components depend on the same source:

- Continuous manual checking is inefficient
- Source must know all dependents
- Adding new components requires modifying existing code

This leads to rigid and fragile systems.

---

## 💡 Observer Pattern — Core Idea

The Observer Pattern introduces a **subscription-based communication model**:

- One object → Publisher (Subject)
- Many objects → Subscribers (Observers)

When state changes:
- Publisher automatically notifies subscribers
- Only interested subscribers are updated

---

## 🧩 Key Concept

Instead of polling (checking repeatedly), we use pushing updates:

- Automatic notifications
- Event-driven behavior
- Loose coupling between components

---

## 🏪 Main Scenario: Store System

### Situation
A store manages products and customers.

Events:
- New product arrival
- Promotions and offers

---

### ❌ Inefficient Approach
- Customers manually check updates
- Store sends notifications to everyone

Problems:
- Wasted effort
- Spam notifications
- Not scalable

---

### ✅ Better Approach
- Customers subscribe to updates
- Store notifies only interested users
- Each user controls what they receive

---

## 🧠 Core Roles

- **Publisher (Subject)** → triggers updates
- **Observers (Subscribers)** → receive updates
- **Event System** → manages subscriptions

---

## 🏗️ Real-World Usage

Observer Pattern is used in:
- Notification systems
- Event-driven architectures
- Messaging apps
- Real-time dashboards
- Stock market updates

---

## ⚖️ When to Use

Use Observer Pattern when:
- Multiple components depend on one source
- Real-time updates are required
- You want dynamic relationships
- You need loose coupling

---

## 🚫 When Not to Use

Avoid when:
- System is simple
- Only one dependency exists
- No event-driven behavior is needed

---

## 🆚 Comparison

| Without Observer | With Observer |
|------------------|--------------|
| Tight coupling   | Loose coupling |
| Manual updates   | Automatic updates |
| Hard to extend   | Easy to extend |
| Static design    | Dynamic design |

---

## 🧠 Key Takeaways

- Observer enables event-driven communication
- Removes direct dependency between components
- Supports scalable system design
- Common in modern backend architectures

---

## 🚀 How to Use This Repository

- Study the scenario first
- Understand publisher vs subscriber roles
- Implement step-by-step examples
- Solve activities independently
- Extend with new observer types

---

## 🤝 Contribution

- Fork the repository
- Add new observer implementations
- Improve notification logic
- Submit pull requests for review

---

## 📌 Final Insight

Observer Pattern is not just about notifications.

It is about building systems where:
- Components are independent
- Communication is automatic
- Architecture remains flexible and scalable
