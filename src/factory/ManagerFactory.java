package factory;

public class ManagerFactory implements AccessFactory{
    @Override
    public Access CreateAccess() {
        return new Manager();
    }
}
