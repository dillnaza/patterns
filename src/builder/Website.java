package builder;

public class Website {
    private String name;
    private Cms Cms;
    private Integer price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        Cms = cms;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", Cms=" + Cms +
                ", price=" + price +
                '}';
    }
}
