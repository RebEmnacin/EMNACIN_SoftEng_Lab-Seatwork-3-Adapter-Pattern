package schoolmanagement;

/**
 * Target interface.
 * This is the common interface that the unified School Management App
 * expects every integrated system to follow. No matter what the
 * underlying system looks like (attendance, grading, library, etc.),
 * the app only ever calls integrateSystem() on it.
 */
public interface SchoolManagementApp {
    void integrateSystem();
}
