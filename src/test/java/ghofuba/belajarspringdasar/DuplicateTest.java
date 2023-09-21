package ghofuba.belajarspringdasar;

import ghofuba.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest {

    @Test
    void testDuplicate() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DuplicateTest.class);



        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            Foo foo = applicationContext.getBean(Foo.class);
        }                );
    }

    @Test
    void getBean(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1,foo2);
    }


}
