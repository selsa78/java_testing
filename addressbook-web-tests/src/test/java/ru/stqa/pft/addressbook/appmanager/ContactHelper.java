package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFname());
    type(By.name("lastname"), contactData.getLname());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getEmail());

    if (creation){                // Проверка наличия или отсутствия элементов
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

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
