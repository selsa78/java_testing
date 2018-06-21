package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactCreation(ContactData contactData) {
    type(By.name("firstname"), contactData.getFname());
    type(By.name("lastname"), contactData.getLname());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getEmail());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void initContactModification() { click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  public void selectContact() { click(By.name("selected[]"));  }

  public void deleteSelectedContacts() { click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));  }

  public void acceptAlert() {
    wd.switchTo().alert().accept();
  }
}
