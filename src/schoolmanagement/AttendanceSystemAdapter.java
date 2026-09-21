package schoolmanagement;

/**
 * Adapter.
 * Wraps an AttendanceSystem instance and translates the standard
 * integrateSystem() call into the AttendanceSystem-specific
 * markAttendance() call.
 */
public class AttendanceSystemAdapter implements SchoolManagementApp {

    private final AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        // Translation happens here: integrateSystem() -> markAttendance()
        attendanceSystem.markAttendance();
    }
}
