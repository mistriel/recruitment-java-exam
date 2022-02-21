package io.java.exam.app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "artists")
@EqualsAndHashCode(of = {"id", "name"})
@NoArgsConstructor
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private int artistId;

    @Column(name = "name")
    private String name;

    @Column(name = "legal_name")
    private String legalName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "rel_artist_album",
            joinColumns = {@JoinColumn(name = "artist_id")},
            inverseJoinColumns = {@JoinColumn(name = "album_id")}
    )
    private Set<Album> albums;
}
