public class Players {
    private String name;
    private int hp;
    private int speed;
    private int power;
    //constructor
    public Players(String name, int hp, int speed, int power){
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.power = power;
    }
    //methods
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public int getSpeed(){
        return speed;
    }
    public int getPower(){
        return power;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nHP: %d\nSpeed: %d\n",name,hp,speed);
    }
}
