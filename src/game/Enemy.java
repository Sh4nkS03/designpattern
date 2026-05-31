package game;


public abstract class Enemy {

   //Puente hacia la interfaz Weapon (¡BRIDGE!)
  
   protected Arma arma;


   //Constructor para asignar un arma al enemigo


   public Enemy(Arma arma) {
       this.arma = arma;
   }

   //Setters y getters para el arma

   public void setArma(Arma arma) {
       this.arma = arma;
   }

   public Arma getArma() {
       return arma;
   }

   // Métodos abstractos que deben implementar las clases concretas

   public abstract void move();
   public abstract int attack(Enemy enemy);
   public abstract void takeDamage(int damage);
   public abstract int getHealth();
}

