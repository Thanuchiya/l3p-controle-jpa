package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "public", name = "salle")
public class SalleEntity {

        @Id

        @GeneratedValue(generator = "sequence_salle")

        private long id;
        private  String name;

    @OneToOne
    @JoinColumn(
            name = "fk_id_cinema",
            referencedColumnName = "id"
    )
    private CinemaEntity cinema;

    @OneToMany(mappedBy = "film")
    private List<FilmEntity> films;

    public SalleEntity(long id, String name, CinemaEntity cinema, List<FilmEntity> films) {
        this.id = id;
        this.name = name;
        this.cinema = cinema;
        this.films = films;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CinemaEntity getCinema() {
        return cinema;
    }

    public void setCinema(CinemaEntity cinema) {
        this.cinema = cinema;
    }

    public List<FilmEntity> getFilms() {
        return films;
    }

    public void setFilms(List<FilmEntity> films) {
        this.films = films;
    }
}

