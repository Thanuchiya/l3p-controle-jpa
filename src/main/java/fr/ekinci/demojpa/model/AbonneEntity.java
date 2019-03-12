package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "public", name = "abonne")
public class AbonneEntity {
    @Id

    @GeneratedValue(generator = "sequence_abonne")

    private long id;
    private  String name;
    private Date dateNaissance;

    @OneToOne
    @JoinColumn(
            name = "fk_id_seance",
            referencedColumnName = "id"
    )
    private SeanceEntity seance;

    public AbonneEntity(long id, String name, Date dateNaissance, SeanceEntity seance) {
        this.id = id;
        this.name = name;
        this.dateNaissance = dateNaissance;
        this.seance = seance;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public SeanceEntity getSeance() {
        return seance;
    }

    public void setSeance(SeanceEntity seance) {
        this.seance = seance;
    }
}
