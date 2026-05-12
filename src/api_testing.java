import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class api_testing {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
try {
    System.out.print("Enter city: ");
    String city = sc.nextLine();
    String apiKey = "bebe361f00b3a3f93e8d9186f515070b";

    String urlString = "https://api.openweathermap.org/data/2.5/weather?q="
            + city + "&appid=" + apiKey + "&units=metric";
    URL url = new URL(urlString);
    HttpURLConnection conn =  (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");

    BufferedReader r = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    String line;
    StringBuilder res = new StringBuilder();

    while((line = r.readLine()) != null){
        res.append(line);
    }
    System.out.println(res.toString());

} catch (Exception e) {
    throw new RuntimeException(e);
}
    }
}