package co.com.choucair.certification.proyectotest.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairsLocationPage {
    public static final Target  LOCATION_BUTTON= Target.the("button that shows us the location form").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
