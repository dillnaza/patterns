package iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "PostgreSQL", "SQL", "OOP"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Dilnaza", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer:" + javaDeveloper.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
