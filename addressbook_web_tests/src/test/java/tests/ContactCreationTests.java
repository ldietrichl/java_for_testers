package tests;

import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {
    @Test
    public void CanCreateShortContact() {
        app.contacts().createContact(new model.ContactData().withFirstName("Vasya").withMiddleName("Ivanovich").withLastName("Pupkin"));
    }

    @Test
    public void CanCreateContactWithEmptyFields() {
        app.contacts().createContact(new model.ContactData());
    }


    //TODO test with all fields need to fix
    @Test
    public void CanCreateContactWithAllFields() {
        app.contacts().createContact(new model.ContactData()
                .withFirstName("Vasya")
                .withMiddleName("Ivanovich")
                .withLastName("Pupkin")
                .withNickName("VasyaPupkin")
                .withAddress("Moscow")
                .withHomeTel("111111")
                .withMobileTel("222222")
                .withWorkTel("333333")
                .withFaxTel("444444")
                .withEmail("a@a.com")
                .withEmail2("b@b.com")
                .withEmail3("c@c.com")
                .withHomepage("d.d.com")
                .withBDay("1")
                .withBMonth("January")
                .withBYear("2000")
                .withADay("2")
                .withAMonth("February")
                .withAYear("2001")

        );
    }


}
