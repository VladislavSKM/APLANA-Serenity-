package ru.aplana.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import ru.aplana.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUsersSteps;

    @Given("пользователь открывает главную станицу mail.ru")
    public void givenTheUserIsOnTheMailHomePage() {
        endUsersSteps.is_the_dictionaryPage_page();
    }

    @When(" пользователь вводит login: '@login' и password: '@pass'")
    public void whenTheUserStriingIn(String login,String pass) {
        endUsersSteps.enters_login(login);
        endUsersSteps.enters_pass(pass);
        endUsersSteps.clickSignInButton();
    }
    @Then("происходит авторизация пользователя")

    public void thenSignIn() {

        endUsersSteps.checkSignIn();

    }
}

