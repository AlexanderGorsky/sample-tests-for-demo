import com.epam.jira.JIRATestKey;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FourthSampleTest {

    @BeforeClass
    public void failedInit() {
        throw new RuntimeException("Cannot find config file.");
    }

    @JIRATestKey(key = "EPMFARMATS-827")
    @Test
    public void blockedDueToFailedConfigsTest() {
        Assert.assertTrue(true);
    }

}
