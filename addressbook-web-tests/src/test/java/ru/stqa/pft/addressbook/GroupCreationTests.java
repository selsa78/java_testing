package ru.stqa.pft.addressbook;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Group53", "Java-testing group 53", "Cool")); //создается новый объект, атрибуты которого заполняются конкретными значениями
        submitGroupCreation();
        returnToGroupPage();
    }

}
