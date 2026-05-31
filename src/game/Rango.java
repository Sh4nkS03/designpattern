package game;

public class Rango implements Arma {
    @Override
    public int getDamage() {
        return 25; // Daño de distancia
    }

    @Override
    public String getName() {
        return "Ataque rango";
    }
}