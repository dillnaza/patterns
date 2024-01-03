package adapter;

public class DatebaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
