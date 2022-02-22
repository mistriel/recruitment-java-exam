package io.java.exam.app.service;

import com.jayway.jsonpath.JsonPath;
import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Data
public class LyricsClient {

    private final String apiKey;
    private final RestTemplate restTemplate;

    @SneakyThrows
    public String getLyrics(String artist, String song){

        URI uri = UriComponentsBuilder.fromUriString("https://api.musixmatch.com/ws/1.1/matcher.lyrics.get")
                .queryParam("q_track", song)
                .queryParam("q_artist", artist)
                .queryParam("apikey", apiKey)
                .build().toUri();

        ResponseEntity<String> apiResponse = restTemplate.exchange(uri, HttpMethod.GET, null, String.class);
        return JsonPath.read(apiResponse.getBody(), "$.message.body.lyrics.lyrics_body");

//        ResponseEntity<LyricsResponse> apiResponse = restTemplate.exchange(uri, HttpMethod.GET, null, LyricsResponse.class);
//        return apiResponse.getBody();
    }
}
