package fr.ekinci.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "abonne")
public class AbonneEntity {
    @Id

    @GeneratedValue(generator = "sequence_abonne")

    private long id;
    private  String name;
}
