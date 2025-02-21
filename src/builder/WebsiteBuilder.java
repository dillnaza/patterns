package builder;

public abstract class WebsiteBuilder {
    Website website;

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();
    
    void createWebsite() {
        website = new Website();
    }
    
    Website getWebsite(){
        return website;
    }
}
