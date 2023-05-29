import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Timer;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryTest {

    String date(long daysToAdd, String pattern) {
        return LocalDate.now().plusDays(daysToAdd).format(DateTimeFormatter.ofPattern(pattern));
    }

    @Test
    public void shouldBeHappyMassageTestV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Новосибирск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__title").shouldHave(text("Успешно!"), Duration.ofSeconds(12));
    }

    @Test
    public void shouldBeHappyMassageTestV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Новосибирск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + date(7, "dd.MM.yyyy")), Duration.ofSeconds(12));
    }

    @Test
    public void closeHappyMassageTest() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Новосибирск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        sleep(12000);
        $("[data-test-id='notification'] button").click();
        $("[data-test-id='notification']").shouldBe(hidden);
    }

    @Test
    public void inputValidValueInCityFieldV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueINCityFieldV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Орёл");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueINCityFieldV3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Йошкар-Ола");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInCityFieldV4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Анадырь");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInCityFieldV5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Великий Новгород");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInCityFieldV6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("ТУЛА");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputInvalidValueInCityFieldV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Петроград");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid .input__sub").shouldHave(exactText("Доставка в выбранный город недоступна"));
    }

    @Test
    public void inputInvalidValueCityFieldV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Возонеж1");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueCityFieldV3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Петропавловск Камчатский");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueCityFieldV4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Оренбург$");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueCityFieldV5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Kursk");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueCityFieldV6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск*");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueCityFieldV7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid .input__sub").shouldHave(exactText("Поле обязательно для заполнения"));
    }

    @Test
    public void inputInvalidValueDateFieldV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "32MMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid .input__sub").shouldHave(exactText("Неверно введена дата"));
    }

    @Test
    public void inputInvalidValueDateFieldV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "00MMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueDateFieldV4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "dd00yyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueDateFieldV5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "dd13yyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueDateFieldV6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueDateFieldV7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue("");
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueDateFieldV8() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue("митропап");
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueDateFieldV9() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue("qwertyui");
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueDateFieldV10() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue("!@#$%^&*");
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueDateFieldV11() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMM2022"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid .input__sub").shouldHave(exactText("Заказ на выбранную дату невозможен"));
    }

    @Test
    public void inputInvalidValueDateFieldV12() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(2, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputValidValueInNameSurnameFieldTestV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Пётр Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInNameSurnameFieldTestV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Map'яна Иванова");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInNameSurnameFieldTestV3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Сергей Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInNameSurnameFieldTestV4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Анна Мария Иванова");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInNameSurnameFieldTestV5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Анна-Мария Иванова");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInNameSurnameFieldTestV6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Я И");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputValidValueInNameSurnameFieldTestV7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("ИВАН ИВАНОВ");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputInvalidValueInNameSurnameFieldTestV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("get name");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid .input__sub").shouldHave(exactText("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы."));
    }

    @Test
    public void inputInvalidValueInNameSurnameFieldTestV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван1 Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueInNameSurnameFieldTestV3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван* Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueInNameSurnameFieldTestV4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("-Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldHave(exactText("Имя и Фамилия указаные неверно."));
    }

    @Test
    public void inputInvalidValueInNameSurnameFieldTestV5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("-");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueInNameSurnameFieldTestV6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue(" ");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid .input__sub").shouldHave(exactText("Поле обязательно для заполнения"));
    }

    @Test
    public void inputInvalidValueInNameSurnameFieldTestV7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputLimitValueInNameSurnameFieldTestV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputLimitValueInNameSurnameFieldTestV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Всеволодомирознающиймиролюбливыйвсеволодомирознающиймиролюбливый Всеволодомирознающиймиролюбливыйвсеволодомирознающиймиролюбливый");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputLimitValueInNameSurnameFieldTestV3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Овсеволодомирознающиймиролюбливыйвсеволодомирознающиймиролюбливый Овсеволодомирознающиймиролюбливыйвсеволодомирознающиймиролюбливый");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid .input__sub").shouldHave(exactText("Значение поля не может быть длиннее 129 символов"));
    }

    @Test
    public void inputInvalidValueInPhoneFieldTestV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("89001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid .input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."));
    }

    @Test
    public void inputInvalidValueInPhoneFieldTestV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+ивановиванн");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueInPhoneFieldTestV3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("getphone");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueInPhoneFieldTestV4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+7900777777$");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidValueInPhoneFieldTestV5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid .input__sub").shouldHave(exactText("Поле обязательно для заполнения"));
    }

    @Test
    public void inputLimitValueInPhoneFieldTestV1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+7900123456");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid .input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."));
    }

    @Test
    public void inputLimitValueInPhoneFieldTestV2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+790012345678");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid .input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."));
    }

    @Test
    public void doNotClickCheckBoxTest() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Майкоп");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("button.button_view_extra").click();
        $("[data-test-id='agreement'].input_invalid").shouldBe(visible);
    }

    @Test
    public void findByListCityTest() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Йо");
        $$("[tabindex='0'] .menu-item__control").find(exactText("Йошкар-Ола")).click();
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(date(7, "ddMMyyyy"));
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(12));
    }

    @Test
    public void inputDateByCalendarTest() {
        int maxDays = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
        int localDay = Integer.parseInt(LocalDate.now().format(DateTimeFormatter.ofPattern("d")));
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Йо");
        $$("[tabindex='0'] .menu-item__control").find(exactText("Йошкар-Ола")).click();
        $("[data-test-id='date']").click();
        if (maxDays - 3 < localDay) {
            $$("td.calendar__day").find(text(date(7, "d"))).click();
        } else if (maxDays - 7 < localDay) {
            $("[data-step='1']").click();
            $$("td.calendar__day").find(text(date(7, "d"))).click();
        } else {
            $$("td.calendar__day").find(text(date(7, "d"))).click();
        }
        $("[data-test-id='name'] input").setValue("Иван Иванов");
        $("[data-test-id='phone'] input").setValue("+79001234567");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + date(7, "dd.MM.yyyy")), Duration.ofSeconds(12));
    }
}
