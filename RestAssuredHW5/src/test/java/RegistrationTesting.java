import Models.Responses.registration.FailureMessage;
import Models.Responses.registration.SuccessMessage;
import Steps.Registration;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTesting {

    @Test
    public void successfulScenarioTest(){

        Response response = Registration.successfulScenario();

        if(response.getStatusCode() == 200){
            SuccessMessage message = response.as(SuccessMessage.class);

            Assert.assertEquals(message.id, 4);
            Assert.assertEquals(message.token, "QpwL5tke4Pnpja7X4");
        }

    }

    @Test
    public void unsuccessfulScenarioTest(){
        Response response = Registration.unsuccessfulScenario();

        if(response.getStatusCode() == 400){
            FailureMessage message = response.as(FailureMessage.class);

            Assert.assertEquals(message.error, "Missing password");
        }

    }


}
