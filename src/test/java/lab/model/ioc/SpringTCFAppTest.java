package lab.model.ioc;

import lab.model.UsualPerson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static lab.model.ioc.SimpleAppTest.getExpectedPerson;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class) //@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:ioc.xml")
public class SpringTCFAppTest {

    @Autowired
    UsualPerson person;

    @Test
    public void testInitPerson() {
        assertEquals(getExpectedPerson(), person);
    }

}
