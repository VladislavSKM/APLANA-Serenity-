package ru.aplana.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://mail.ru/")
public class DictionaryPage extends PageObject {

    @FindBy(xpath = "//*[@id='mailbox__login']")

    private WebElementFacade login;

    @FindBy(xpath = "//*[@id='mailbox__password']")

    private WebElementFacade password;

    @FindBy(xpath = "//*[@id='mailbox__auth__button']")

    private WebElementFacade signInButton;

    @FindBy(xpath = "//a[@class='b-toolbar__btn js-shortcut']")

    private WebElementFacade linkMyPage;


    public void enterLogin(String keyword) {
        login.type(keyword);
    }


    public void enterPass(String keyword) {

        password.type(keyword);

    }

    public void clickSignInButton() {

        signInButton.click();

    }

    public boolean takeLinkMyPage() {

        return linkMyPage.isEnabled();

    }
}