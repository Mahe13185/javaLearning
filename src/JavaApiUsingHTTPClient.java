import org.json.JSONObject;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

class JavaApiUsingHTTPClinet{
    public static void checkWeather() throws  IOException ,InterruptedException{
        Scanner sc = new Scanner(System.in);
        String api_key = Apikey.getapi();
        System.out.println("Enter City Name: ");
        String city = sc.nextLine();
        String strUrl = "http://api.weatherapi.com/v1/current.json?key=" + api_key + "&q=" + city;

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(strUrl)).GET().build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        //JSON Parsing
        //String ---> jsonObject
        JSONObject jsonobj = new JSONObject(httpResponse.body());

        if (jsonobj.has("location")) {
            JSONObject location = jsonobj.getJSONObject("location");
            JSONObject current = jsonobj.getJSONObject("current");

            String name = location.getString("name");
            String country = location.getString("country");
            JSONObject conditionObject = current.getJSONObject("condition");
            String condition = conditionObject.getString("text");
            int humidity = current.getInt("humidity");
            double temp = current.getDouble("temp_c");

            System.out.println("========================\n" +
                    "    Weather Report\n" +
                    "========================");
            System.out.println(name +"        :" + temp);
            System.out.println("Country       :" + country);
            System.out.println("Temperature   :" + temp + "℃");
            System.out.println("Condition     :" + condition);
            System.out.println("Humidity      :" + humidity + "%");
//            System.out.println(httpResponse.body());
        }else {
            System.out.println("Enter Valid City");
        }
    }
    public static void main()   {
        try {
            checkWeather();
        }catch (IOException e){
            System.out.println("IOException");
        }catch (InterruptedException e ){
            System.out.println("Interrupted Exception");
        }
    }
}