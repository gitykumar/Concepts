package com.yogesh.firstspringproject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final String IS_SITE_UP = "Site is Up !";
    private final String IS_SITE_DOWN = "Ahhh is DOWN !";
    private final String INCORRECT_URL = "URL is incorrect";

    @GetMapping("/check")
    public String getUrlStatusMessage(@RequestParam String url) {
        String message = "";

        try {
            URL urlObj = new URL(url);
            HttpsURLConnection conn = (HttpsURLConnection) urlObj.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode() / 100;
            if (responseCode != 2 & responseCode != 3) {
                message = IS_SITE_DOWN;
            } else {
                message = IS_SITE_UP;
            }
        } catch (MalformedURLException e) {

            message = INCORRECT_URL;
        } catch (IOException e) {
            message = IS_SITE_DOWN;
        }
        return message;

    }
}
