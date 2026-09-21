# Integrating Different School Systems into a Unified School Management Application

## Problem Statement

You are developing a school management application that helps administrators manage various school systems such as attendance, grading, and library management. Each system has different interfaces and methods. To ensure compatibility and seamless integration, you need to create adapters for different systems to allow them to connect to the unified school management application.

**Adaptee Objects:**

* AttendanceSystem - Represents an attendance tracking system that needs to be integrated. It has the `markAttendance()` method.
* GradingSystem - Represents a grading system that requires integration. It has the `recordGrades()` method.
* LibrarySystem - Represents a library management system that needs to be integrated. It has the `manageBooks()` method.

**Target Object:**

* SchoolManagementApp - Represents a unified school management application with a common interface for integrating systems. It defines the `integrateSystem()` method as the target method.

**Adapter Objects:**

* AttendanceSystemAdapter - An adapter for integrating the attendance system into the school management application. It adapts the `AttendanceSystem` to the `SchoolManagementApp` interface, translating `integrateSystem()` to `markAttendance()`.
* GradingSystemAdapter - An adapter for integrating the grading system into the school management application. It adapts the `GradingSystem` to the `SchoolManagementApp` interface, translating `integrateSystem()` to `recordGrades()`.
* LibrarySystemAdapter - An adapter for integrating the library management system into the school management application. It adapts the `LibrarySystem` to the `SchoolManagementApp` interface, translating `integrateSystem()` to `manageBooks()`.

## Solution — Java (Adapter Pattern)

```
src/schoolmanagement/
├── SchoolManagementApp.java        (Target interface)
├── AttendanceSystem.java           (Adaptee)
├── GradingSystem.java              (Adaptee)
├── LibrarySystem.java              (Adaptee)
├── AttendanceSystemAdapter.java    (Adapter)
├── GradingSystemAdapter.java       (Adapter)
├── LibrarySystemAdapter.java       (Adapter)
└── Main.java                       (Demo / client code)
```

### How it works
`SchoolManagementApp` only knows about one method: `integrateSystem()`. Each real-world
system (`AttendanceSystem`, `GradingSystem`, `LibrarySystem`) has its own method name that
doesn't match that interface. Each Adapter class implements `SchoolManagementApp` and, inside
`integrateSystem()`, calls the adaptee's real method. The app can then treat all three systems
identically.

### Run it yourself
```
javac -d out src/schoolmanagement/*.java
java -cp out schoolmanagement.Main
```

**Output:**
```
=== Integrating all school systems into SchoolManagementApp ===
AttendanceSystem: Attendance has been marked for all students.
GradingSystem: Grades have been recorded for all students.
LibrarySystem: Books have been checked in/out and catalog updated.
```

Tested with OpenJDK 21 — compiles and runs with no errors.
