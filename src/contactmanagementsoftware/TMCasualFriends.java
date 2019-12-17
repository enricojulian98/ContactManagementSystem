package professionalacquitances;

public abstract class TMCasualFriends {
    
    final void person() {
        name();
        mobileNumber();
        email();
        information();
    }
    
    abstract void information();
    
    void name() {
        System.out.println("Name: Nessie");
    }
    
    void mobileNumber() {
        System.out.println("Mobile Number: +60123456789");
    }
    
    void email() {
        System.out.println("Email: nessie@gmail.com");
    }
} // Close CasualFriends

