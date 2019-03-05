package fr.ubo.spi.projetAgileSpi.dao;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PromotionEntityPK implements Serializable {
    private String codeFormation;
    private String anneeUniversitaire;

    @Column(name = "CODE_FORMATION")
    @Id
    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    @Column(name = "ANNEE_UNIVERSITAIRE")
    @Id
    public String getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(String anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionEntityPK that = (PromotionEntityPK) o;
        return Objects.equals(codeFormation, that.codeFormation) &&
                Objects.equals(anneeUniversitaire, that.anneeUniversitaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeFormation, anneeUniversitaire);
    }
}
