package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
      app.getNavigationHelper().gotoHomePage();
      app.getContactHelper().initContactCreation();
      app.getContactHelper().fillContactForm(new ContactData("Sergey", "Selivanov", "+79637854990", "selsa@mail.ru", "Group53"), true);
      app.getContactHelper().submitContactCreation();
      app.getNavigationHelper().gotoHomePage();
    }

}
