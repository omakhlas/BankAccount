package fr.wesquad.kata.banqueaccount;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
public class BanqueAccountTest {

    @Test
    void contextLoads() {
    }

}