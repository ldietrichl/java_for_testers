package model;

public record ContactData(String firstName, String lastName, String nickName, String middleName, String title,
                          String company, String address, String homeTel, String mobileTel, String workTel,
                          String faxTel, String email, String email2, String email3, String homepage, String bday,
                          String bmonth, String byear, String aday, String amonth, String ayear) {
    public ContactData() {
        this("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
    }

    public ContactData(String firstName, String lastName, String nickName, String middleName, String title, String company, String address, String homeTel, String mobileTel, String workTel, String faxTel, String email, String email2, String email3, String homepage, String bday, String bmonth, String byear, String aday, String amonth, String ayear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.middleName = middleName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homeTel = homeTel;
        this.mobileTel = mobileTel;
        this.workTel = workTel;
        this.faxTel = faxTel;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.aday = aday;
        this.amonth = amonth;
        this.ayear = ayear;
    }

    public ContactData withFirstName(String firstName) {
        return new ContactData(firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withLastName(String lastName) {
        return new ContactData(this.firstName, lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withMiddleName(String middleName) {
        return new ContactData(this.firstName, this.lastName, middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withNickName(String nickName) {
        return new ContactData(this.firstName, this.lastName, this.middleName, nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withAddress(String address) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withHomeTel(String homeTel) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withMobileTel(String mobileTel) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withWorkTel(String workTel) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withFaxTel(String faxTel) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withEmail(String email) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withEmail2(String email2) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);

    }

    public ContactData withEmail3(String email3) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withHomepage(String homepage) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withBDay(String day) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, day,
                this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withBMonth(String month) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                month, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withBYear(String year) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, year, this.aday, this.amonth, this.ayear);
    }

    public ContactData withADay(String day) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, day, this.amonth, this.ayear);
    }

    public ContactData withAMonth(String month) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, month, this.ayear);
    }

    public ContactData withAYear(String year) {
        return new ContactData(this.firstName, this.lastName, this.middleName, this.nickName,
                this.title, this.company, this.address, this.homeTel,
                this.mobileTel, this.workTel, this.faxTel, this.email,
                this.email2, this.email3, this.homepage, this.bday,
                this.bmonth, this.byear, this.aday, this.amonth, year);
    }
}