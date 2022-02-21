package io.java.exam.app.model;

import io.java.exam.app.enums.GENRE;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "albums")
@EqualsAndHashCode(of = {"id", "name"})
@NoArgsConstructor
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private int albumId;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private GENRE genre;

    @Column(name = "release_date")
    private Date releaseDate;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "rel_album_songs",
            joinColumns = {@JoinColumn(name = "album_id")},
            inverseJoinColumns = {@JoinColumn(name = "song_id")}
    )
    private Set<Song> songs;
}
