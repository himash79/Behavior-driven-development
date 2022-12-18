import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lk.himash.controller.DiscountController;
import org.junit.Assert;

public class DiscountControllerTest {

    DiscountController discountController = null;
    String percentage = "";

    @Given("^Execute DiscountController Business$")
    public void execute_DiscountController_Business() throws Throwable {

    }

    @When("^if i will enter (\\d+)$")
    public void if_i_will_enter(int arg1) throws Throwable {
        percentage = discountController.getDiscount(arg1);
    }

    @Then("^we should get ten percentage discount$")
    public void we_should_get_ten_percentage_discount() throws Throwable {
        Assert.assertEquals("10%", percentage);
    }

    @Then("^we should get fifteen percentage discount$")
    public void we_should_get_fifteen_percentage_discount() throws Throwable {
        Assert.assertEquals("15%", percentage);
    }

    @Then("^we shouldn't get any percentage$")
    public void we_shouldn_t_get_any_percentage() throws Throwable {
        Assert.assertEquals("NA", percentage);
    }

}
