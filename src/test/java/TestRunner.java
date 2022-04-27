import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends AppLaunch {
    public TestCase testCase;

    @Test
    public void runTest() {
        testCase = new TestCase(driver);
        String result = testCase.openApp();
        Assert.assertEquals(result,"13");
    }
}
