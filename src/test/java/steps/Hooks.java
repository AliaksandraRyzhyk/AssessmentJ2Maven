package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void openUrl() {
        Configuration.timeout = 6000;
        open("https://fizcult.by/");
    }
}
