package lab.model.ioc;

import lab.model.Country;
import lab.model.UsualPerson;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class SimpleAppTest {

    static final String CONFIG = "ioc.xml";
    BeanFactory context = new ClassPathXmlApplicationContext(CONFIG);

    @Test
    public void testInitPerson() {
        Assert.assertEquals(getExpectedPerson(), context.getBean("person"));
    }

    public static UsualPerson getExpectedPerson() {
        return UsualPerson.builder()
                .age(35)
                .height(1.78F)
                .isProgrammer(true)
                .name("John Smith")
                .country(Country.builder()
                        .name("Russia")
                        .codeName("RU").build())
                .contact("asd@asd.ru")
                .contact("+7-234-456-67-89")
                .build();
    }
}
