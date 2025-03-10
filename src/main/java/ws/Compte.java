package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement(name ="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;

@XmlTransient
    private Date dateCreation;

    public Compte() {

    }

    // Constructeur avec paramètres
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }


    // Getter pour le code
    public int getCode() {
        return code;
    }

    // Setter pour le code
    public void setCode(int code) {
        this.code = code;
    }

    // Getter pour le solde
    public double getSolde() {
        return solde;
    }

    // Setter pour le solde
    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Getter pour la date de création
    public Date getDateCreation() {
        return dateCreation;
    }

    // Setter pour la date de création
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
