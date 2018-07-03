package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
      int before = app.getContactHelper().getContactCount();
      app.getContactHelper().createContact(new ContactData("Sergey", "Selivanov", "+79637854990", "selsa@mail.ru", "Group53"), true);
      app.getNavigationHelper().gotoHomePage();
      int after = app.getContactHelper().getContactCount();
      Assert.assertEquals(after, before + 1);
    }

}
