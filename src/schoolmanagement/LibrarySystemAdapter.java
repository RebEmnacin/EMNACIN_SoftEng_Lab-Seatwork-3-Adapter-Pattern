package schoolmanagement;

/**
 * Adapter.
 * Wraps a LibrarySystem instance and translates the standard
 * integrateSystem() call into the LibrarySystem-specific
 * manageBooks() call.
 */
public class LibrarySystemAdapter implements SchoolManagementApp {

    private final LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        // Translation happens here: integrateSystem() -> manageBooks()
        librarySystem.manageBooks();
    }
}
