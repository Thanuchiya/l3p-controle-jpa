package fr.ekinci.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "film")

public class FilmEntity {

        @Id

        @GeneratedValue(generator = "sequence_film")

        private long id;
        private  String name;


}
