package factory;

public class Manager implements Access{
    @Override
    public void AddProduct() {
        System.out.println("Manager added new product");
    }

    @Override
    public void EditProduct() {
        System.out.println("Manager edited product");
    }

    @Override
    public void DeleteProduct() {
        System.out.println("Manager deleted product");
    }
}
