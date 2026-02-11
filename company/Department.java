package company;

public enum Department {

    IT("Information Technology"), HR("Human Resources"),
    SALES("Sales Department"), FINANCE("Finance Department"),
    SUPPORT("Customer Support");

    private String displayName;

    Department(String displayName) {

        this.displayName = displayName;
    }

//    public String getDisplayName() {
//        return displayName;
//    }

    @Override
    public String toString() {

        return  displayName;
    }
}
