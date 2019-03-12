package fr.ekinci.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema = "public", name = "societe")
public class SocieteEntity {
        @Id

        @GeneratedValue(generator = "sequence_societe")

        private long id;
        private  String name;

    }
