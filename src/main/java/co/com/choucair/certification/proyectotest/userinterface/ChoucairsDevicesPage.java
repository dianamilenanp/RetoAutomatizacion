package co.com.choucair.certification.proyectotest.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairsDevicesPage {

    public static final Target  SELECT_COMPUTER=Target.the("where do we select the computer").located(By.xpath("//div[@name='osId']"));
    public static final Target  SELECT_VERSION=Target.the("where do we select the version").located(By.xpath("//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']"));
    public static final Target  SELECT_LANGUAGE=Target.the("where do we select the language").located(By.xpath("//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']"));

    public static final Target  SELECT_MOBILE=Target.the("where do we select the mobile device").located(By.xpath("//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched-add ng-untouched-remove ng-touched ng-touched-add-active ng-untouched-remove-active']"));
    public static final Target  SELECT_MODEL=Target.the("where do we select the model").located(By.xpath("//span[@class='ui-select-match-text pull-left ui-select-allow-clear']"));
    public static final Target  SELECT_SYSTEM=Target.the("where do we select the OS").located(By.xpath("//span[@class='ui-select-match-text pull-left ui-select-allow-clear']"));

    public static final Target  FINAL_BUTTON= Target.the("button that shows us the final form").located(By.xpath("//span[@class='ui-select-match-text pull-left ui-select-allow-clear']"));


}
