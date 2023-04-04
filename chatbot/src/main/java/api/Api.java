package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Api
{

    public static String executeGetRequest(String requestUrl) throws Exception {
        URL url = new URL(requestUrl);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        urlConnection.setRequestMethod("GET");

        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;


        while ((inputLine = bufferReader.readLine()) != null)
        {
            response.append(inputLine);
        }

        bufferReader.close();
        urlConnection.disconnect(); // Verbindung schließen

        return response.toString();
    }

}
