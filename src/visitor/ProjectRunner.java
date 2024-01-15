package visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer juniorDeveloper = new JuniorDeveloper();
        Developer seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWritten(juniorDeveloper);

        System.out.println("==============================");

        System.out.println("Senior in action...");
        project.beWritten(seniorDeveloper);
    }
}
