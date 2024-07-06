package tests;

import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Test;

public class ContactModificationTests extends TestBase {


    @Test
    void CanModifyContact(){
        if (!app.contacts().isContactPresent()) {
            app.contacts().createContact(new ContactData().withFirstName("Vasya").withMiddleName("Ivanovich").withLastName("Pupkin"));
        }
        app.contacts().modifyContact(new ContactData().withFirstName("Nikita"));

    }
}
