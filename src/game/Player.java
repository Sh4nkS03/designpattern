package game;


public class Player extends Enemy {
   private int life = 100;
   private int posx;
   private int posy;


   public Player(Arma arma) {
       super(arma);
   }


   @Override
   public void move() {
       posx = (int) (Math.random() * 100);
       posy = (int) (Math.random() * 100);
   }


   @Override
   public int attack(Enemy enemy) {
       int dmgRealizado = arma.getDamage();
       enemy.takeDamage(dmgRealizado);
       return dmgRealizado;
   }


   @Override
   public void takeDamage(int damage) {
       this.life -= damage;
   }


   @Override
   public int getHealth() {
       return life;
   }

   public int getPosx() {
       return this.posx;
   }

   public void setPosx(int x) {
       this.posx = x;
   }

   public int getPosy() {
       return this.posy;
   }

   public void setPosy(int y) {
       this.posy = y;
   }
}
