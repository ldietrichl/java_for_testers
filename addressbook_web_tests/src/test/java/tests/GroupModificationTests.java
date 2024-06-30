package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupModificationTests extends TestBase {

    @Test
    void CanModifyGroup(){
        if (!app.groups().isGroupPresent()) {
            app.groups().createGroup(new GroupData("name", "header", "Group_footer"));
        }
        app.groups().modifyGroup(new GroupData().withName("modified name"));
    }
}
