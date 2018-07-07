package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
      List<ContactData> before = app.getContactHelper().getContactList();
      ContactData contact = new ContactData("Sergey", "Selivanov", "+79637854990", "selsa@mail.ru", "Group53");
      app.getContactHelper().createContact(contact, true);
      app.getNavigationHelper().gotoHomePage();
      List<ContactData> after = app.getContactHelper().getContactList();
      Assert.assertEquals(after.size(), before.size() + 1);

      int max = after.stream().max ((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId();
      contact.setId(max);
      before.add(contact);
      Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }

}
