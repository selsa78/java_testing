package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {

      app.getContactHelper().initContactCreation();
      app.getContactHelper().fillContactCreation(new ContactData("Sergey", "Selivanov", "+79637854990", "selsa@mail.ru"));
      app.getContactHelper().submitContactCreation();
    }

}
