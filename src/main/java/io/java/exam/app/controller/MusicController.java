package io.java.exam.app.controller;

import io.java.exam.app.model.Artist;
import io.java.exam.app.service.*;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class MusicController  {

    private final MusicService musicService;

    @GetMapping("/catalog/metadata")
    public ResponseEntity<CatalogMetadata> getCatalogMetadata(){
        return ResponseEntity.ok(musicService.getMusicCatalog());
    }

    @GetMapping("/catalog/artists")
    public ResponseEntity<List<Artist>> getAllArtists(){
        return ResponseEntity.ok(musicService.getAllArtists());
    }

    @GetMapping(value = "/catalog/{artist}/{song}/lyrics")
    public ResponseEntity<String> getLyrics(@PathVariable(value="artist") String artist, @PathVariable(value="song") String song){
        return ResponseEntity.ok(musicService.getSongLyrics(artist, song));
    }

}
