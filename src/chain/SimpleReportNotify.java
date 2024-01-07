package chain;

public class SimpleReportNotify extends Notifier {
    public SimpleReportNotify(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report " + message);
    }
}
