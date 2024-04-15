package id.ac.ui.cs.advprog.heymartauth.model;

public enum UserRoleEnum {
    ADMIN("ADMIN"),
    MANAGER("MANAGER"),
    CUSTOMER("CUSTOMER");

    private final String value;

    UserRoleEnum(String value) {
        this.value = value;
    }

    public static boolean contains(String value) {
        for (UserRoleEnum role : UserRoleEnum.values()) {
            if (role.value.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
