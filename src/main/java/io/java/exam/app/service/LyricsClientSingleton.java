package io.java.exam.app.service;

import org.springframework.web.client.RestTemplate;

public class LyricsClientSingleton {

    private static  LyricsClient lyricsClient;

    public static LyricsClient INSTANCE(){
        if(lyricsClient == null){
            lyricsClient = new LyricsClient("request-api-key-from-your-reviewer", new RestTemplate());
        }
        return lyricsClient;
    }
}
