package POO.Challange1.Central;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico {
    private List<String> contacts;

    public AparelhoTelefonico() {
        this.contacts = new ArrayList<>();

        this.contacts.add("123456789");
        this.contacts.add("987654321");
        this.contacts.add("987654320");
    }

    public List<String> getContacts() { return contacts; }
    public void setContacts(List<String> contacts) { this.contacts = contacts; }

    public void call(String tel) {
        if (this.contacts.contains(tel)) {
            System.out.println("Calling " + tel);
            return;
        }

        System.out.println("Contact not found");
    }

    public void toMeet(String tel) {
        System.out.println("Meeting " + tel);
    }

    public void startingVoiceMail() {
        System.out.println("Starting voice mail");
    }
}
