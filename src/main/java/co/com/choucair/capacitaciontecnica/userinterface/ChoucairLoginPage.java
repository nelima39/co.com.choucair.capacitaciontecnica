package co.com.choucair.capacitaciontecnica.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Boton que visualiza el formulario para loguin").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("Donde nosotros ingresamos el usuario").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Donde nosotros ingresamos el password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Boton que confirma el loguin").located(By.xpath("//button[contains(@class, 'btn btn-primary') and contains(text(),'Acceder')]"));
}
