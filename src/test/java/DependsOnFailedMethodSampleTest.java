import com.epam.jira.JIRATestKey;
import com.epam.jira.testng.ExecutionListener;
import com.epam.jira.testng.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;

@Listeners(ExecutionListener.class)
public class DependsOnFailedMethodSampleTest {
    private final Random random = new Random();


    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void alwaysFailedMethod() {
        Assert.assertTrue(false);
    }

    @Test (dependsOnMethods = "alwaysFailedMethod")
    @JIRATestKey(key = "EPMFARMATS-826")
    public void testMethod() {
        Assert.assertTrue(random.nextBoolean());

    }

}
