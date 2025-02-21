package factory;

public class User implements Access{
    @Override
    public void AddProduct() {
        System.out.println("User cant add product");
    }

    @Override
    public void EditProduct() {
        System.out.println("User cant edit product");
    }

    @Override
    public void DeleteProduct() {
        System.out.println("User cant delete product");
    }
}
