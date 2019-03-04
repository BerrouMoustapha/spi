package fr.ubo.spi.projetAgileSpi.dao;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "candidat", schema = "projet_agile_spi", catalog = "")
public class CandidatEntity {
    private String noCandidat;
    private String codeFormation;
    private String anneeUniversitaire;
    private String nom;
    private String prenom;
    private String sexe;
    private Timestamp dateNaissance;
    private String lieuNaissance;
    private String nationalite;
    private String telephone;
    private String mobile;
    private String email;
    private String adresse;
    private String codePostal;
    private String ville;
    private String paysOrigine;
    private String universiteOrigine;
    private String listeSelection;
    private Double selectionNoOrdre;
    private String confirmationCandidat;
    private Timestamp dateReponseCandidat;

    @Id
    @Column(name = "NO_CANDIDAT")
    public String getNoCandidat() {
        return noCandidat;
    }

    public void setNoCandidat(String noCandidat) {
        this.noCandidat = noCandidat;
    }

    @Basic
    @Column(name = "CODE_FORMATION")
    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    @Basic
    @Column(name = "ANNEE_UNIVERSITAIRE")
    public String getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(String anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
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
    @Column(name = "SEXE")
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Basic
    @Column(name = "DATE_NAISSANCE")
    public Timestamp getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Timestamp dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Basic
    @Column(name = "LIEU_NAISSANCE")
    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    @Basic
    @Column(name = "NATIONALITE")
    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
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
    @Column(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "PAYS_ORIGINE")
    public String getPaysOrigine() {
        return paysOrigine;
    }

    public void setPaysOrigine(String paysOrigine) {
        this.paysOrigine = paysOrigine;
    }

    @Basic
    @Column(name = "UNIVERSITE_ORIGINE")
    public String getUniversiteOrigine() {
        return universiteOrigine;
    }

    public void setUniversiteOrigine(String universiteOrigine) {
        this.universiteOrigine = universiteOrigine;
    }

    @Basic
    @Column(name = "LISTE_SELECTION")
    public String getListeSelection() {
        return listeSelection;
    }

    public void setListeSelection(String listeSelection) {
        this.listeSelection = listeSelection;
    }

    @Basic
    @Column(name = "SELECTION_NO_ORDRE")
    public Double getSelectionNoOrdre() {
        return selectionNoOrdre;
    }

    public void setSelectionNoOrdre(Double selectionNoOrdre) {
        this.selectionNoOrdre = selectionNoOrdre;
    }

    @Basic
    @Column(name = "CONFIRMATION_CANDIDAT")
    public String getConfirmationCandidat() {
        return confirmationCandidat;
    }

    public void setConfirmationCandidat(String confirmationCandidat) {
        this.confirmationCandidat = confirmationCandidat;
    }

    @Basic
    @Column(name = "DATE_REPONSE_CANDIDAT")
    public Timestamp getDateReponseCandidat() {
        return dateReponseCandidat;
    }

    public void setDateReponseCandidat(Timestamp dateReponseCandidat) {
        this.dateReponseCandidat = dateReponseCandidat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidatEntity that = (CandidatEntity) o;
        return Objects.equals(noCandidat, that.noCandidat) &&
                Objects.equals(codeFormation, that.codeFormation) &&
                Objects.equals(anneeUniversitaire, that.anneeUniversitaire) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(sexe, that.sexe) &&
                Objects.equals(dateNaissance, that.dateNaissance) &&
                Objects.equals(lieuNaissance, that.lieuNaissance) &&
                Objects.equals(nationalite, that.nationalite) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(email, that.email) &&
                Objects.equals(adresse, that.adresse) &&
                Objects.equals(codePostal, that.codePostal) &&
                Objects.equals(ville, that.ville) &&
                Objects.equals(paysOrigine, that.paysOrigine) &&
                Objects.equals(universiteOrigine, that.universiteOrigine) &&
                Objects.equals(listeSelection, that.listeSelection) &&
                Objects.equals(selectionNoOrdre, that.selectionNoOrdre) &&
                Objects.equals(confirmationCandidat, that.confirmationCandidat) &&
                Objects.equals(dateReponseCandidat, that.dateReponseCandidat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noCandidat, codeFormation, anneeUniversitaire, nom, prenom, sexe, dateNaissance, lieuNaissance, nationalite, telephone, mobile, email, adresse, codePostal, ville, paysOrigine, universiteOrigine, listeSelection, selectionNoOrdre, confirmationCandidat, dateReponseCandidat);
    }
}
