package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SearchTestFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class SearchTestCase extends BaseTest {

    @Test
    public void searchTest() {
        SearchTestFunction search = new SearchTestFunction(driver);
        search.searchTest();
    }
}
