package fr.ekinci.demojpa.model;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "seance")
public class SeanceEntity {
    @Id

    @GeneratedValue(generator = "sequence_seance")

    private long id;
    private  String name;
    private String langue;
    private Integer prix;


    @OneToOne
    @JoinColumn(
            name = "fk_id_film",
            referencedColumnName = "id"
    )
    private FilmEntity film;


    @OneToOne
    @JoinColumn(
            name = "fk_id_abonne",
            referencedColumnName = "id"
    )
    private AbonneEntity abonne;

    public SeanceEntity(long id, String name, String langue, Integer prix, FilmEntity film, AbonneEntity abonne) {
        this.id = id;
        this.name = name;
        this.langue = langue;
        this.prix = prix;
        this.film = film;
        this.abonne = abonne;
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

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public FilmEntity getFilm() {
        return film;
    }

    public void setFilm(FilmEntity film) {
        this.film = film;
    }

    public AbonneEntity getAbonne() {
        return abonne;
    }

    public void setAbonne(AbonneEntity abonne) {
        this.abonne = abonne;
    }
}
