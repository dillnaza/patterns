package state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();
        developer.setActivity(activity);
        for (int i = 1; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
