package mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        Admin admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserTChat(user1);
        chat.addUserTChat(user2);

        user1.sendMessage("Hello I'm user 1");
        admin.sendMessage("I'm admin");
    }
}
