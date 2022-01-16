package uz.dreamcode.nbu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.dreamcode.nbu.model.NBUModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NBU {
    private static final String NBU_BASE_API_URL = "https://nbu.uz/uz/exchange-rates/json/";
    private static StringBuilder data;

    public NBU() {
        getConnection();
    }

    public String getConnection() {
        data = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connect().getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line.trim());
            }
            reader.close();
            return data.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static HttpURLConnection connect() {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(NBU_BASE_API_URL).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            return connection;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public NBUModel[] getDataModel() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(String.valueOf(data), NBUModel[].class);
    }
}
