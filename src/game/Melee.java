package game;

public class Melee implements Arma {
    @Override
    public int getDamage() {
        return 15; // Daño cuerpo a cuerpo
    }

    @Override
    public String getName() {
        return "Melee";
    }
}