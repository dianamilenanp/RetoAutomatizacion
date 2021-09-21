package co.com.choucair.certification.proyectotest.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairsRegisterPage  {
    public static final Target  INPUT_FIRSTNAME=Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target  INPUT_LASTNAME=Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target  INPUT_EMAIL=Target.the("where do we write the email").located(By.id("email"));
    public static final Target  SELECT_MONTH=Target.the("where do we select the month").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target  SELECT_DAY=Target.the("where do we select the day").located(By.xpath("//select[@id='birthDay']"));
    public static final Target  SELECT_YEAR=Target.the("where do we select the year").located(By.xpath("//select[@id='birthYear']"));
    public static final Target  BUTTON_PAGE_LOCATION=Target.the("where do we change the page").located(By.xpath("//a[@class='btn btn-blue']"));

    //*[@id="mobile-device"]/div[1]/div[2]/div/ul

    //*[@id="mobile-device"]/div[2]/div[2]/div/input[1]
}
