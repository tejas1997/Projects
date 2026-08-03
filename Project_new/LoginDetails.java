import java.util.*;

public class LoginDetails {
    private String username;
    private String password;
    private String url;
    public LoginDetails(String username, String password, String url)
    {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setUrl(String url)
    {
        this.url = url;
    }

    public void displayLoginDetails()
    {
        System.out.println("Username -> " + username);
        System.out.println("Password -> " + password);
        System.out.println("URL -> " + url);
    }

public static void main(String[] args)
{
    HashMap<String, LoginDetails> loginDetailsMap = new HashMap<>();
    LoginDetails user1 = new LoginDetails(
"tejas", "password123", "https://example.com"
    );
    LoginDetails user2 = new LoginDetails(
"john", "password456", "https://example.com"
    );
    loginDetailsMap.put(user1.getUsername(), user1);
    loginDetailsMap.put(user2.getUsername(), user2);
    for(Map.Entry<String, LoginDetails> entry: loginDetailsMap.entrySet()){
        //System.out.println("Key: " + entry.getKey());
        LoginDetails details = entry.getValue();
        details.displayLoginDetails();
    }
}
}