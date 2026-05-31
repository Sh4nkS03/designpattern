package game;

public class Melee implements Arma {
   @Override
   public int getDamage() {
       return 15;
   }

   @Override
   public String getName() {
       return "Ataque melee";
   }
}
