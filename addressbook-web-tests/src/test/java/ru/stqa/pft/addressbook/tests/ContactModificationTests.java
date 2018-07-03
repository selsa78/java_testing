package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Sergey", "Selivanov", "+79637854990", "selsa@mail.ru", "Group53"), true);
    }
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Sergey", "Ivanov", "+79637854990", "selsa@mail.ru", null), false);
    app.getContactHelper().submitContactModification();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);
  }
}
