package game;
import external.robo.EnemyRobot;

public class Main {
    public static void main(String[] args) {
        Enemy enemy1 = new Player();
        Enemy enemy2 = new Player();
        

        enemy2.takeDamage(enemy1.attack(enemy2));
        System.out.println(enemy2.getHealth());
        
        EnemyRobot robotExterno = new EnemyRobot(); 
        
        Enemy robotEnemy = new RobotAdapter(robotExterno);
        
        enemy2.takeDamage(robotEnemy.attack(enemy2));
        System.out.println("Salud de enemy2 (tras ataque del Robot): " + enemy2.getHealth());

        }
}