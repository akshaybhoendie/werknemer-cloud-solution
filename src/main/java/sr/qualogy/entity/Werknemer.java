package sr.qualogy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Werknemer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String voornaam;
    public String achternaam;
    public String extensie;
    public String telefoon;

    public Werknemer(Integer id, String voornaam, String achternaam, String extensie, String telefoon) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.extensie = extensie;
        this.telefoon = telefoon;
    }

    public Werknemer() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getExtensie() {
        return extensie;
    }

    public void setExtensie(String extensie) {
        this.extensie = extensie;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }
}
