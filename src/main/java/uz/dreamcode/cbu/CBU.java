package uz.dreamcode.cbu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.dreamcode.cbu.model.CBUModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CBU {
    private static final String CBU_BASE_API_URL = "https://cbu.uz/oz/arkhiv-kursov-valyut/json/";
    private static String data;

    public CBU() {
        getConnection();
    }

    public String getConnection() {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(CBU_BASE_API_URL).openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line.trim());
            }
            data = String.valueOf(response);
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CBUModel[] getCBUDataModel() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(data, CBUModel[].class);
    }
}
