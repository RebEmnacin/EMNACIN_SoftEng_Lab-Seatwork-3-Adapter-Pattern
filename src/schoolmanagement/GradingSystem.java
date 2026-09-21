package schoolmanagement;

/**
 * Adaptee.
 * An existing grading system with its own method name (recordGrades)
 * that does NOT match the SchoolManagementApp interface.
 */
public class GradingSystem {
    public void recordGrades() {
        System.out.println("GradingSystem: Grades have been recorded for all students.");
    }
}
