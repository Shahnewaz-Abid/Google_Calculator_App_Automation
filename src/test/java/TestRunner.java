import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends AppLaunch {
    @Test
    public void runTest() {
        TestCase testCase = new TestCase(driver);
        String result = testCase.openApp();
        Assert.assertEquals(result,"13");
    }
}
