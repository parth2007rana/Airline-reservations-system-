package Airline.model;

// Admin just models the role. Login itself is hardcoded in Main1.
public class Admin extends Person {
    public Admin(String name) {
        super(0, name, 0, null);
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}

