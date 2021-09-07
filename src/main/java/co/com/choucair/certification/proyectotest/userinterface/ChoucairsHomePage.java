package co.com.choucair.certification.proyectotest.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairsHomePage  {
    public static final Target  REGISTER_BUTTON= Target.the("button that shows us the form to register").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
