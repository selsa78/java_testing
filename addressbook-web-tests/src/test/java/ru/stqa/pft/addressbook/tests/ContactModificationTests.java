package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactCreation(new ContactData("Sergey", "Ivanov", "+79637854990", "selsa@mail.ru"));
    app.getContactHelper().submitContactModification();
  }
}
