package observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");
        Observer firstSubscriber = new Subscriber("Dilnaza Baidakhanova");
        Observer secondSubscriber = new Subscriber("Dilnaza");
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addVacancy("Third Java Position");
    }
}
