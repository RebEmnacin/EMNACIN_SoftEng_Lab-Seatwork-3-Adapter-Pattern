package schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<SchoolManagementApp> integratedSystems = new ArrayList<>();

        integratedSystems.add(new AttendanceSystemAdapter(new AttendanceSystem()));
        integratedSystems.add(new GradingSystemAdapter(new GradingSystem()));
        integratedSystems.add(new LibrarySystemAdapter(new LibrarySystem()));

        System.out.println("=== Integrating all school systems into SchoolManagementApp ===");
        for (SchoolManagementApp system : integratedSystems) {
            system.integrateSystem();
        }
    }
}
