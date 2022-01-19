package co.com.choucair.capacitaciontecnica.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UNIVERSIDAD = Target.the("Selecciona la Universida Choucair").located(By.xpath("//*[@id='certificaciones']/div[1]/a/h4/strong"));
    public static final Target INPUT_SEARCH = Target.the("ingresa el nombre del curso a buscar").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da Click para buscar el curso").located(By.xpath("id('coursesearch')//button[contains(text(),'Ir')]"));
    public static final Target SELECT_COURSE = Target.the("Da Click sobre el link del curso").located(By.xpath("//div/h4/a[contains(@href, 'https://operacion.choucairtesting.com/academy/course/view.php?id=1252')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Automatización de Pruebas')]"));
}
