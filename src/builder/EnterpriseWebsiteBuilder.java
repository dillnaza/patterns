package builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }
}
