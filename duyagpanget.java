package haha.duyag;
import java.util.Scanner;

public class HAHADuyag {
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
              try{
                  System.out.print("Enter Gladiator 1 Name:");
                  String name1 = in.nextLine();
                  
                  System.out.print("Enter" + name1 
                          + "health points:");
                  double health = in.nextDouble();
                  
                  System.out.print("Enter" + name1 
                          + "damage points:");
                  int damage = in.nextInt();
                  
                  System.out.print("Enter" + name1 
                          + "defence points:");
                  int defence = in.nextInt();
                  
                  System.out.print("Enter" + name1
                          + "initiative+:");
                  int initiative = in.nextInt();
                  
                  String enemyName = "gabun";
                  double enemyHealth = 100.0;
                  int randDamage = (int) (Math.random () * (50 - 25 + 1)+ 25);
                  int randDefence = (int) (Math.random () * (30 - 15 + 1)+ 15);
                  int randInt = (int) (Math.random () * (100 - 10 + 1)+ 10);
                  
            Gladiator Glad1 =
                new Gladiator(name1, health, damage, defence, initiative);
            Gladiator glad2 = 
                new Gladiator(enemyName, enemyHealth, 
                        randDamage, randDefence, randInt);
        
            System.out.println(
            Gladiator.fight(Glad1, glad2).getName()
                + "wins.");
        
                break;
              }catch(Exception e){
                  System.out.println("Invalid input!");
                  in.nextLine();
              }
        }
        
    }
    
}
