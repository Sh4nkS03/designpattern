package game;


import external.robo.EnemyRobot;


public class RobotAdapter extends Enemy {
   private EnemyRobot robot;


   //Constructor que recibe el Adapter y el Bridge (Arma)


   public RobotAdapter(EnemyRobot robot, Arma arma) {
       super(arma);
       this.robot = robot;
   }


   @Override
   public void move() {
       // Usamos una distancia predeterminada, por ejemplo, 5 unidades.
       robot.moveForward(5);
   }


   @Override
   public int attack(Enemy enemy) {
       int dmgRealizado = arma.getDamage();
       System.out.println("Robot ataca con " + arma.getName() + " causando " + dmgRealizado + " de daño.");
       robot.smash(dmgRealizado);
       return dmgRealizado;
   }


   @Override
   public void takeDamage(int damage) {
       // El método equivalente en el JAR es receiveShock
       robot.receiveShock(damage);
   }


   @Override
   public int getHealth() {
       // En el robot, la "vida" es el nivel de energía
       return robot.energyLevel();
   }
}
