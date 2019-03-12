package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "public", name = "film")

public class FilmEntity {

        @Id

        @GeneratedValue(generator = "sequence_film")

        private long id;
        private  String name;
        private String realisateur;
        private List<String > acteurs;
        private String categorie;
        private Date date_sortie;
        private String duree;
        private String classification;

        @OneToOne
        @JoinColumn(
                name = "fk_id_salle",
                referencedColumnName = "id"
        )
        private SalleEntity salleEntity;

        @OneToMany(mappedBy = "seance")
        private List<SeanceEntity> seances;

        public FilmEntity(long id, String name, String realisateur, List<String> acteurs, String categorie, Date date_sortie, String duree, String classification, SalleEntity salleEntity, List<SeanceEntity> seances) {
            this.id = id;
            this.name = name;
            this.realisateur = realisateur;
            this.acteurs = acteurs;
            this.categorie = categorie;
            this.date_sortie = date_sortie;
            this.duree = duree;
            this.classification = classification;
            this.salleEntity = salleEntity;
            this.seances = seances;
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

        public String getRealisateur() {
            return realisateur;
        }

        public void setRealisateur(String realisateur) {
            this.realisateur = realisateur;
        }

        public List<String> getActeurs() {
            return acteurs;
        }

        public void setActeurs(List<String> acteurs) {
            this.acteurs = acteurs;
        }

        public String getCategorie() {
            return categorie;
        }

        public void setCategorie(String categorie) {
            this.categorie = categorie;
        }

        public Date getDate_sortie() {
            return date_sortie;
        }

        public void setDate_sortie(Date date_sortie) {
            this.date_sortie = date_sortie;
        }

        public String getDuree() {
            return duree;
        }

        public void setDuree(String duree) {
            this.duree = duree;
        }

        public String getClassification() {
            return classification;
        }

        public void setClassification(String classification) {
            this.classification = classification;
        }

        public SalleEntity getSalleEntity() {
            return salleEntity;
        }

        public void setSalleEntity(SalleEntity salleEntity) {
            this.salleEntity = salleEntity;
        }

        public List<SeanceEntity> getSeances() {
            return seances;
        }

        public void setSeances(List<SeanceEntity> seances) {
            this.seances = seances;
        }
}
