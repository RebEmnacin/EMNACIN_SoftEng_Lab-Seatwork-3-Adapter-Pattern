package schoolmanagement;

/**
 * Adapter.
 * Wraps a GradingSystem instance and translates the standard
 * integrateSystem() call into the GradingSystem-specific
 * recordGrades() call.
 */
public class GradingSystemAdapter implements SchoolManagementApp {

    private final GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        // Translation happens here: integrateSystem() -> recordGrades()
        gradingSystem.recordGrades();
    }
}
