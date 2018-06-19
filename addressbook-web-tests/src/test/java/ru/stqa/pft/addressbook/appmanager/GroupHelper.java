package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper {
  private FirefoxDriver wd;               //wd - переменная, атрибут объекта типа GroupCreationTests; создание объекта этого класса

  public GroupHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void returnToGroupPage() {
      wd.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupData groupData) {       //метод приинмает один параметр типа GroupData - это объект, у которого три атрибута
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
  }

  public void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
  }
}
