package fr.ekinci.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "cinema")

public class CinemaEntity {
    @Id

    @GeneratedValue(generator = "sequence_cinema")

    private long id;
    private  String name;
}
