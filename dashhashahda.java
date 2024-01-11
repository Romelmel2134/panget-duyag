package haha.duyag;


public class Gladiator {
    
    private String name;
    private double health;
    private int damage;
    private int defense;
    private int initiative;
    
    public Gladiator (String name, double health, int damage, int defence,
            int initiative) {
        
    setName(name);
    setHealth(health);        
    setDamage(damage);
    setDefence(defence);
    setInitiative(initiative);
    
}
    public String getName(){
        return this.name;
}
    public double getHealth(){
        return this.health;
    }
    public int getDamage(){
        return this.damage;
    }
    public int getDefence(){
        return this.defense;
    }
    public int getInitiative(){
        return this.initiative;
}
    public void setName(String newName){
        if (newName.isEmpty()){
            System.out.println("name cannot be empty");
        }else{
            this.name = newName;
        }
    }
    
    public void setHealth (double newHealth){
        if (newHealth <= 0){
            System.out.println("Health cannot be less or equal to 0");
        } else{
            this.health = newHealth;
        }
    }
    public void setDamage (int newDamage){
        if(newDamage <= 0 ){
            System.out.println("damage cannot be less than or equal to 0");
        }else {
            this.damage = newDamage;
        }
    }
    public void setDefence(int newDefence){
        if (newDefence < 0 && newDefence >= 100){
            System.out.println("defence cannot be less than 0 ");
        }else {
            this.defense = newDefence;
        }
    }
    public void setInitiative(int newInitiative){
        if(newInitiative >= 0){
            this.initiative = newInitiative;
        }else{
            System.out.println("Initiative cannot be less than 0,");
        }
    }
    public static void displayGladiotorStats(Gladiator glad){
        System.out.println(glad.getName()
                + ", health: " + glad.getHealth()
                + ",damage: " + glad.getDamage()
                + ",defense: " + glad.getDefence()
                + ",initiative: " + glad.getInitiative());
    }
    public static Gladiator fight(Gladiator glad1, Gladiator glad2){
        displayGladiotorStats(glad1);
        displayGladiotorStats(glad2);
        
        int round = 1;
        int turn = glad1.getInitiative() > glad2.getInitiative()?
                1 : 2;
        while(true){
            if(turn == 2){
                glad2.health -= 
                        glad1.damage - (glad1.damage * (glad2.defense/100.0));
                
                System.out.println("round" + round +";"
                        + glad1.getName() + "does"
                        + glad1.getDamage() + "damage"
                        + glad2.getDefence() + "% of which"
                        + glad2.getName() + "ignore."
                        + glad2.getName() + "has"
                        + glad2.getHealth() + "health left.");
                turn = 2;
            }else{
                if(turn == 1){
                glad1.health -= 
                        glad2.damage - (glad2.damage * (glad1.defense/100));
                
                System.out.println("round" + round +";"
                        + glad2.getName() + "does"
                        + glad2.getDamage() + "damage"
                        + glad1.getDefence() + "% of which"
                        + glad1.getName() + "ignore."
                        + glad1.getName() + "has"
                        + glad1.getHealth() + "health left.");
                turn = 1;
            }
              if(glad1.getHealth()<= 0){
                  return glad2;
              }else if(glad2.getHealth() <= 0){
                  return glad1;
            }
         } 
            round++;
    }
  }        
}
