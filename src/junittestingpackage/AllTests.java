package junittestingpackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ addstrings.class, testaddnumbers.class })
public class AllTests {

}
