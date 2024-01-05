package proxy;

public class RealProject implements Project {
    private String url;

    public void load() {
        System.out.println("Loading project from " + url + "...");
    }

    public RealProject(String url) {
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
