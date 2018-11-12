package com.company;

import com.company.json.JSONPanel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class DynamicGUITest {
    public static void main(String[] args) {
        List<JSONPanel> panels = parseJSON("/layout.json");
        new MainWindow(panels);

    }

    public static List<JSONPanel> parseJSON(String filePath){
        JSONPanel[] panels = {};
        URL url = DynamicGUITest.class.getResource(filePath);
        System.out.println(url.getPath());
        try (Reader reader = new InputStreamReader(url.openStream(), StandardCharsets.UTF_8)) {
            Gson gson = new GsonBuilder().create();
            panels = gson.fromJson(reader, JSONPanel[].class);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Arrays.asList(panels);
    }
}
