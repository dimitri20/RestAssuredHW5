
import Models.Requests.posting.User;
import Models.Responses.posting.SuccessMessage;
import Steps.Posting;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.Generate;


public class PostingTesting {

    @Test
    public void successfulScenarioTest(){

        String name = Generate.randomString(10);
        String job = Generate.randomString(10);

        User user = new User(name, job);
        Response response = Posting.postUser(user);
        SuccessMessage message = response.as(SuccessMessage.class);

        if(response.getStatusCode() == 201){
            Assert.assertEquals(message.name, name);
            Assert.assertEquals(message.job, job);
        }

    }

}
