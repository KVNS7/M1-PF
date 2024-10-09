package Exo2.Generalisation1;

import java.util.Set;

public interface Arbre<T> { // à généraliser
    int taille();
    boolean contient(final T val);
    Set<T> valeurs();
}