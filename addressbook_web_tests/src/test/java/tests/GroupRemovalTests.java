package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupRemovalTests extends TestBase {


    @Test
    public void CanRemoveGroup() {
        TestBase.app.OpenGroupsPage();
        if (!TestBase.app.isGroupPresent()) {
            TestBase.app.createGroup(new GroupData("name", "header", "Group_footer"));
        }
        TestBase.app.removeGroup();
    }

}
