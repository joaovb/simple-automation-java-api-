import com.codeborno.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test 
    public void userCanSearchKeywordWithGoogle() {

        open("https://google.com.br");

        $(By.name("q")).setValue("Selenide").pressEnter();
        $$("#ires li.g").shouldHave(size(10));
        $("#ires li.g").shouldHave(text("selenide: concise UI tests in Java"));

    }
}