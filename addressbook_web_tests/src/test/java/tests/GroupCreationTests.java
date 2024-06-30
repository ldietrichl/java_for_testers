package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void CanCreateGroup() {
        TestBase.app.OpenGroupsPage();
        TestBase.app.createGroup(new GroupData("name", "header", "Group_footer"));

    }


    @Test
    public void CanCreateGroupWithEmptyName() {
        TestBase.app.OpenGroupsPage();
        TestBase.app.createGroup(new GroupData());


    }

    @Test
    public void CanCreateGroupWithNameOnly() {
        TestBase.app.OpenGroupsPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("some name");

        TestBase.app.createGroup(groupWithName);
    }
}
