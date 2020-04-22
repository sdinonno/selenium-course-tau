package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.DropdownPage;

import java.util.List;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectedOption(){
        DropdownPage dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");
    }

}
