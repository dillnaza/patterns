package factory;

public class AdminFactory implements AccessFactory {
    @Override
    public Access CreateAccess() {
        return new Admin() ;
    }
}
