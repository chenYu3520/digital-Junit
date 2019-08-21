import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This program demonstrates console input.
 *
 * @author sally
 * @version 1.10 2019-08-2122:31
 */

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {TestSuiteA.class, TestSuiteB.class})
public class MasterTestSuite {
}
