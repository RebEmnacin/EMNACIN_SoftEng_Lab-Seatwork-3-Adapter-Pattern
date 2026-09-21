package schoolmanagement;

/**
 * Adaptee.
 * An existing attendance tracking system with its own method name
 * (markAttendance) that does NOT match the SchoolManagementApp interface.
 */
public class AttendanceSystem {
    public void markAttendance() {
        System.out.println("AttendanceSystem: Attendance has been marked for all students.");
    }
}
