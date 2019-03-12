package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(schema = "public", name = "societe")
public class SocieteEntity {
        @Id

        @GeneratedValue(generator = "sequence_societe")

        private long id;
        private  String name;

    @OneToMany(mappedBy = "cinema")
    private List<CinemaEntity> cinemas;

    public SocieteEntity(long id, String name, List<CinemaEntity> cinemas) {
        this.id = id;
        this.name = name;
        this.cinemas = cinemas;
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

    public List<CinemaEntity> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<CinemaEntity> cinemas) {
        this.cinemas = cinemas;
    }
}

