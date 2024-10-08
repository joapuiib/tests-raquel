public class Persona {
    private String nom;
    private String cognoms;
    private int edat;

    public Persona(String nom, String cognoms, int edat) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
    }

    public Persona(String nom, String cognoms) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = 0;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public int getEdat() {
        return edat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String toString() {
        return nom + " " + cognoms + " (" + edat + ")";
    }

    public boolean esMajorEdat() {
        return edat >= 18;
    }
}
