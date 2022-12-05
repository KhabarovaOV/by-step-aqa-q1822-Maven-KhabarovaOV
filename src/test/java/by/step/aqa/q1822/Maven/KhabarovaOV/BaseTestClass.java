package by.step.aqa.q1822.Maven.KhabarovaOV;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTestClass implements PropertiesReader{
    @BeforeAll
    public void readProperties(){
        readProperties1();
    }
}
