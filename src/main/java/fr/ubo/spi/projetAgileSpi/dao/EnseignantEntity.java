package fr.ubo.spi.projetAgileSpi.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "enseignant", schema = "projet_agile_spi", catalog = "")
public class EnseignantEntity {
    private int noEnseignant;
    private String type;
    private String sexe;
    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;
    private String pays;
    private String mobile;
    private String telephone;
    private String emailUbo;
    private String emailPerso;

    @Id
    @Column(name = "NO_ENSEIGNANT")
    public int getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(int noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    @Basic
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "SEXE")
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Basic
    @Column(name = "NOM")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "PRENOM")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "ADRESSE")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "CODE_POSTAL")
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Basic
    @Column(name = "VILLE")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "PAYS")
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Basic
    @Column(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "TELEPHONE")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "EMAIL_UBO")
    public String getEmailUbo() {
        return emailUbo;
    }

    public void setEmailUbo(String emailUbo) {
        this.emailUbo = emailUbo;
    }

    @Basic
    @Column(name = "EMAIL_PERSO")
    public String getEmailPerso() {
        return emailPerso;
    }

    public void setEmailPerso(String emailPerso) {
        this.emailPerso = emailPerso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnseignantEntity that = (EnseignantEntity) o;
        return noEnseignant == that.noEnseignant &&
                Objects.equals(type, that.type) &&
                Objects.equals(sexe, that.sexe) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(adresse, that.adresse) &&
                Objects.equals(codePostal, that.codePostal) &&
                Objects.equals(ville, that.ville) &&
                Objects.equals(pays, that.pays) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(emailUbo, that.emailUbo) &&
                Objects.equals(emailPerso, that.emailPerso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noEnseignant, type, sexe, nom, prenom, adresse, codePostal, ville, pays, mobile, telephone, emailUbo, emailPerso);
    }
}
