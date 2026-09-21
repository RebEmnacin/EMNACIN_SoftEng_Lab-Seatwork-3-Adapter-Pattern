package schoolmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Client / Demo.
 * Shows how the unified SchoolManagementApp can integrate three completely
 * different systems (attendance, grading, library) through ONE common
 * method: integrateSystem(). The app never needs to know each system's
 * real method name — that's the whole point of the Adapter pattern.
 */
public class Main {
    public static void main(String[] args) {

        List<SchoolManagementApp> integratedSystems = new ArrayList<>();

        // Wrap each real (adaptee) system in its matching adapter
        integratedSystems.add(new AttendanceSystemAdapter(new AttendanceSystem()));
        integratedSystems.add(new GradingSystemAdapter(new GradingSystem()));
        integratedSystems.add(new LibrarySystemAdapter(new LibrarySystem()));

        System.out.println("=== Integrating all school systems into SchoolManagementApp ===");
        for (SchoolManagementApp system : integratedSystems) {
            // Same call every time, regardless of what's underneath
            system.integrateSystem();
        }
    }
}
