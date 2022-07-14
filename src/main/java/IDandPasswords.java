import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> loginInfo = new HashMap<>();

    IDandPasswords(){
        loginInfo.put("Damian","haslo1");
        loginInfo.put("Konrad","roblox");
        loginInfo.put("Emilka","konie");

    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
