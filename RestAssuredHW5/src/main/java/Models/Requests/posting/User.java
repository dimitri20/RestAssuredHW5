package Models.Requests.posting;

import org.json.simple.JSONObject;

public class User {

    public String name;
    public String job;

    public User(String name, String job){
        this.name = name;
        this.job = job;
    }

    public User(){

    }
    public String generateJsonString(){
        JSONObject obj = new JSONObject();
        if(this.name != null){
            obj.put("name", this.name);
        }

        if(this.job != null){
            obj.put("job", this.job);
        }

        return obj.toJSONString();
    }
}