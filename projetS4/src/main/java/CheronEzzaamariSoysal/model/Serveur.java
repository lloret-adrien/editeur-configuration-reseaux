package main.model;

import javafx.scene.image.ImageView;

public class Serveur extends Composant {

    public Serveur() {
        super("Serveur");
    }

    public Serveur(ImageView imageView, String adresseIP) {
        super(imageView, adresseIP);
    }
}