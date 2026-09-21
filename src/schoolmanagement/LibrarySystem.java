package schoolmanagement;

/**
 * Adaptee.
 * An existing library management system with its own method name
 * (manageBooks) that does NOT match the SchoolManagementApp interface.
 */
public class LibrarySystem {
    public void manageBooks() {
        System.out.println("LibrarySystem: Books have been checked in/out and catalog updated.");
    }
}
