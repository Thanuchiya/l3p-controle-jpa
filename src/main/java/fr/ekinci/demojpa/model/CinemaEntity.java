package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "public", name = "cinema")

public class CinemaEntity {
    @Id

    @GeneratedValue(generator = "sequence_cinema")

    private long id;
    private  String name;

    @OneToOne
    @JoinColumn(
            name = "fk_id_societe",
            referencedColumnName = "id"
    )
    private SocieteEntity societe;

    @OneToMany(mappedBy = "salle")
    private List<SalleEntity> salles;

    public CinemaEntity(long id, String name, SocieteEntity societe, List<SalleEntity> salles) {
        this.id = id;
        this.name = name;
        this.societe = societe;
        this.salles = salles;
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

    public SocieteEntity getSociete() {
        return societe;
    }

    public void setSociete(SocieteEntity societe) {
        this.societe = societe;
    }

    public List<SalleEntity> getSalles() {
        return salles;
    }

    public void setSalles(List<SalleEntity> salles) {
        this.salles = salles;
    }
}
