package academy.mindswap.user.utils;

public enum FormLabels {
    USERNAME("Input username"),
    EMAIL("Input email"),
    PASSWORD("Input password"),
    DELETE("Confirm delete");

    String label;

    FormLabels(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

}
