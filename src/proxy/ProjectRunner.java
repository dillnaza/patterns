package proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/dillnaza/realProject");
        project.run();
    }
}
