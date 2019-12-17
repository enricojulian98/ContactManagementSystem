package professionalacquitances;

public abstract class TMCasualFriendsWithHook {
    
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
} // Close class

class ProfessionalFriendsWithHook extends TMCasualFriendsWithHook {
    
    public void information() {
        System.out.println("Information: UI Developer at IT Solutions");
    }
} // Close ProfessionalFriendsWithHook

class CasualAcquitancesWithHook extends TMCasualFriendsWithHook {
    
    public void information() {
        System.out.println("Information: Primary school since 2002");
    }
} // Close ProfessionalFriendsWithHook

