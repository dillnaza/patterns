package factory;

public class Admin implements Access {
    @Override
    public void AddProduct() {
        System.out.println("Admin added new product");
    }

    @Override
    public void EditProduct() {
        System.out.println("Admin edited product");
    }

    @Override
    public void DeleteProduct() {
        System.out.println("Admin deleted product");
    }
}
