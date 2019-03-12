package fr.ekinci.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "salle")
public class SalleEntity {

        @Id

        @GeneratedValue(generator = "sequence_salle")

        private long id;
        private  String name;
}

