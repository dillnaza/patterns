package facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Spring is active.");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}
