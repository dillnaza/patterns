package chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotify(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotify(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);
        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);
        reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("We've had problems here!!", Priority.ASAP);
    }
}
