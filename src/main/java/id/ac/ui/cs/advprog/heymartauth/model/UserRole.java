package id.ac.ui.cs.advprog.heymartauth.model;

public enum UserRole {
    ADMIN("ADMIN"),
    MANAGER("MANAGER"),
    CUSTOMER("CUSTOMER");

    private final String value;

    UserRole(String value) {
        this.value = value;
    }

    public static boolean contains(String value) {
        for (UserRole role : UserRole.values()) {
            if (role.value.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
