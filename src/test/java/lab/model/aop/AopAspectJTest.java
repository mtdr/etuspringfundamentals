package lab.model.aop;

import lab.common.TestUtils;
import lab.model.ApuBar;
import lab.model.Bar;
import lab.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class AopAspectJTest {

    String s;

    @Autowired
    Bar bar;

    @Autowired
    Customer customer;

    @Before
    public void setUp() throws Exception {
        s = TestUtils.fromSystemOutPrintln(() -> bar.sellSquishee(customer));
    }

    @Test
    public void testBeforeAdvice() {
        assertTrue("Before advice is not good enought...", s.contains("Hello"));
        assertTrue("Before advice is not good enought...", s.contains("How are you doing?"));
    }

    @Test
    public void testAfterAdvice() {
        assertTrue("After advice is not good enought...", s.contains("Good Bye!"));
    }

    @Test
    public void testAfterReturningAdvice() {
        assertTrue("Customer is broken", s.contains("Good Enough?"));
    }

    @Test
    public void testAroundAdvice() {
        assertTrue("Around advice is not good enought...", s.contains("Hi!"));
        assertTrue("Around advice is not good enought...", s.contains("See you!"));
    }

    @Test
    public void testAllAdvices() {
        assertFalse("barObject instanceof ApuBar", bar instanceof ApuBar);
    }
}