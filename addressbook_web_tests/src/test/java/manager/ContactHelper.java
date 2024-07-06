package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);

    }

    public void createContact(ContactData contact) {
        OpenContactsPage();
        initContactCreation();
        fillContactForm(contact);
        submitGroupCreation();
        OpenContactsPage();
    }

    public void modifyContact(ContactData modifiedContact) {
        OpenContactsPage();
        selectContact();
        initContactModification();
        fillContactForm(modifiedContact);
        submitContactModification();
        OpenContactsPage();

    }

    public void removeContact() {
        OpenContactsPage();
        selectContact();
        removeSelectedContact();
        OpenContactsPage();
    }


    public void OpenContactsPage() {
        if (!manager.isElementPresent(By.name("home"))) {
            click(By.linkText("home"));
        }
    }

    public boolean isContactPresent() {
        OpenContactsPage();
        return manager.isElementPresent(By.name("selected[]"));
    }


    private void submitGroupCreation() {
        click(By.name("submit"));
    }


    private void initContactCreation() {
        if (!manager.isElementPresent(By.name("home"))) {
            click(By.linkText("add new"));
        }
    }


    private void removeSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
    }


    private void submitContactModification() {
        click(By.name("update"));

    }

    private void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.firstName());
        type(By.name("middlename"), contact.middleName());
        type(By.name("lastname"), contact.lastName());
        type(By.name("address"), contact.address());
        type(By.name("home"), contact.homeTel());
        type(By.name("mobile"), contact.mobileTel());
        type(By.name("work"), contact.workTel());
        type(By.name("email"), contact.email());
        type(By.name("email2"), contact.email2());
        type(By.name("email3"), contact.email3());
    }


    private void selectContact() {
        click(By.name("selected[]"));
    }

    private void initContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }


}
