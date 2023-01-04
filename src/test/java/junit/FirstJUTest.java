package junit;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Browsers.FIREFOX;

public class FirstJUTest {

@BeforeAll
static void beforeAll() {
    Configuration.browser = FIREFOX;
    System.out.println("before all");
}
    @AfterAll
    static void afterAll() {
        Configuration.browser = FIREFOX;
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {

        System.out.println("dsfsdfsdfdsf");
    }
    @AfterEach
    void afterEach() {

        System.out.println("sdfdsfgfdgdfg");

    }

    @Test
    void firstTest() {
        System.out.println("gfhfg");

    }
    @Test
    void secondTest() {
        System.out.println("gfeeeehfg");

    }
}
