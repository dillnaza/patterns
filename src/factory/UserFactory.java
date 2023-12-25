package factory;

public class UserFactory implements AccessFactory{
    @Override
    public Access CreateAccess() {
        return new User();
    }
}
