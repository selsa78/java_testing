package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
      List<ContactData> before = app.getContactHelper().getContactList();
      app.getContactHelper().createContact(new ContactData("Sergey", "Selivanov", "+79637854990", "selsa@mail.ru", "Group53"), true);
      app.getNavigationHelper().gotoHomePage();
      List<ContactData> after = app.getContactHelper().getContactList();
      Assert.assertEquals(after.size(), before.size() + 1);
    }

}
