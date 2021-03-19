package testcases;import com.postcodes.framework.MyLogger;import com.postcodes.helper.Util;import java.time.LocalDateTime;import java.time.format.DateTimeFormatter;import static org.junit.Assert.assertEquals;public class BaseTest {    private Class returnClassname(){        return getClass();    }    public void start(){        MyLogger.resInfoLog(BaseTest.class, "Test Case "+returnClassname()+" started at: "+LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));    }    public void fiish(){        MyLogger.resInfoLog(BaseTest.class, "Test Case "+returnClassname()+" ended at: "+LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));    }    public void testActivity(String activity){        MyLogger.resInfoLog(BaseTest.class, "Test Step ----=== "+activity+" ===----");    }    public void testSteps(int step){        MyLogger.resInfoLog(BaseTest.class, "Test Step ----==+ "+step+" +==----");    }    public void assertEqualwithQuation(String expected, String actual) {        assertEquals(Util.joinQuatation(expected),actual);    }    public void assertEqualwithQuation(int expected, int actual) {        assertEquals(Util.joinQuatation(String.valueOf(expected)),actual);    }}