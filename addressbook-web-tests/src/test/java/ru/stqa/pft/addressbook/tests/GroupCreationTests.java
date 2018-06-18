package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Group53", "Java-testing group 53", "Cool")); //создается новый объект, атрибуты которого заполняются конкретными значениями
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
