package Exo2.Generalisation3;

public class Entier implements Sommable<Entier> {
    private final int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public Entier somme(Entier autre) {
        return new Entier(this.valeur + autre.valeur);
    }

    @Override
    public String toString() {
        return String.valueOf(valeur);
    }
}
