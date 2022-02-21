package io.java.exam.app.controller;

import io.java.exam.app.service.CatalogMetadata;
import io.java.exam.app.service.MusicService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
public class MusicController {

    private final MusicService musicService;

    @GetMapping("/catalog/metadata")
    public ResponseEntity<CatalogMetadata> getCatalogDuration(){
        return ResponseEntity.ok(musicService.getMusicCatalog());
    }

}
