package Models.Requests.registration;

import org.json.simple.JSONObject;

public class User {

    public String email;
    public String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email) {
        this.email = email;
    }

    public String generateJsonString(){
        JSONObject o = new JSONObject();
        o.put("email", this.email);
        o.put("password", this.password);
        return o.toJSONString();
    }
}
