package fr.ekinci.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "seance")
public class SeanceEntity {
    @Id

    @GeneratedValue(generator = "sequence_seance")

    private long id;
    private  String name;
}
