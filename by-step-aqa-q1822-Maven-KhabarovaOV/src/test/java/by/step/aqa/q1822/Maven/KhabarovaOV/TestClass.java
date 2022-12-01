package by.step.aqa.q1822.Maven.KhabarovaOV;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClass extends BaseTestClass{
    @Test
    public void testMethod(){
        readProperties1();
        String url = System.getProperty("base-url");
        Assertions.assertEquals("http:\\\\yandex.ru",url);
    }
    @Test
    public void testMethodTwo(){
        readProperties1();
        String text = System.getProperty("base-cod");
        Assertions.assertEquals("name",text);
    }

}
