package io.java.exam.app.model;

import io.java.exam.app.enums.GENRE;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "songs")
@EqualsAndHashCode(of = {"id", "name", "artist"})
@ToString(of = {"name"})
@NoArgsConstructor
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private int songId;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private double duration;

    @Column(name = "genre")
    @Enumerated(EnumType.STRING)
    private GENRE genre;
}
