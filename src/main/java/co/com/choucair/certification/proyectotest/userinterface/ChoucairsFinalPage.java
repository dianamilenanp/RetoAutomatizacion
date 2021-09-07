package co.com.choucair.certification.proyectotest.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairsFinalPage {
    public static final Target  INPUT_PASSWORD=Target.the("where do we write the password").located(By.id("password"));
    public static final Target  INPUT_CONFIRM_PASSWORD=Target.the("where do we write the password again").located(By.id("confirmPassword"));
    public static final Target  CHECK_TERMS=Target.the("where do we accept the conditions").located(By.xpath("//input[@id='termOfUse']"));
    public static final Target  CHECK_PRIVACY_POLICY=Target.the("where do we accept the privacy policy").located(By.xpath("//input[@id='privacySetting']"));
    public static final Target  BUTTON_COMPLETE_SETUP= Target.the("button that ends the register").located(By.xpath("//a[@class='btn btn-blue']"));


}
