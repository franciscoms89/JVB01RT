public class Persona {

    int id;
    String nom;
    int edad;
    String direc;
    int telf;

    public Persona() {
    }

    public Persona(int id, String nom, int edad, String direc, int telf) {
        this.id = id;
        this.nom = nom;
        this.edad = edad;
        this.direc = direc;
        this.telf = telf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", edad=" + edad +
                ", direc='" + direc + '\'' +
                ", telf=" + telf +
                '}';
    }
}

