package io.java.exam.app.service;

import io.java.exam.app.model.Album;
import io.java.exam.app.model.Artist;
import io.java.exam.app.model.Song;
import io.java.exam.app.repository.ArtistRepository;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Data
@Transactional
public class MusicService {

    private final ArtistRepository artistRepository;

    public CatalogMetadata getMusicCatalog(){

        List<Artist> artistList = artistRepository.findAll();

        CatalogMetadata metadata = new CatalogMetadata();
        metadata.setArtists(artistList.size());

        for(Artist artist: artistList){
            for(Album album: artist.getAlbums() ){
                metadata.setAlbums(metadata.getAlbums() + artist.getAlbums().size());
                metadata.setSongs(metadata.getSongs() + album.getSongs().size());
                for(Song song: album.getSongs()){
                    metadata.setDuration(metadata.getDuration() + song.getDuration());

                }
            }
        }
        return metadata;
    }
}