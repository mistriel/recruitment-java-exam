package io.java.exam.app.repository;

import io.java.exam.app.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}
