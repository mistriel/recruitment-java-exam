package io.java.exam.app.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LyricsResponse {

    private MessageBody message;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MessageBody{
        private LyricsBody body;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LyricsBody{
        private Lyrics lyrics;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Lyrics{

        @JsonProperty("lyrics_body")
        private String lyricsBody;
    }
}
