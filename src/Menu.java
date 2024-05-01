import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    Scanner scnr = new Scanner(System.in);
    Playerbase playerbase = new Playerbase();
    public void displayMenu(){
        int i = 0;
        while (i != 5) {
            System.out.println("********* MENU *********");
            System.out.println("1) Add a Character");
            System.out.println("2) Remove a Character ");
            System.out.println("3) Display All Characters");
            System.out.println("4) Battle Characters");
            System.out.println("5) EXIT");
            System.out.println(">>");
            i = Integer.parseInt(scnr.next());


            if (i == 1) {
                createCharacter();
            } else if (i == 2) {
                deleteCharacter();
            } else if (i == 3) {
                displayCharacters();
            } else if (i == 4) {
                battleCharacters();
            } else if (i == 5) {
                break;
            } else {
                System.out.println("INVALID ENTRY");
            }
        }
    }
    private void createCharacter(){
        System.out.println("What's your character's name?? ");
        String name = scnr.next();

        System.out.println("What's your character's HP?? ");
        int hp = Integer.parseInt(scnr.next());

        System.out.println("What's your character's Speed?? ");
        int speed = Integer.parseInt(scnr.next());

        System.out.println("What's your character's Power??  ");
        int power = Integer.parseInt(scnr.next());

        Players myPlayer = new Players(name, hp, speed, power);
        playerbase.addPlayer(myPlayer);

        System.out.println("Player added!");
    }
    private void deleteCharacter(){
        System.out.println("Which player would you like to be removed??");
        String name = scnr.next();

        Players get = playerbase.getPlayers(name);
        if (get == null){
            System.out.println("PLAYER NOT FOUND!!");
        }
        else{
            playerbase.removePlayer(get);
        }
    }
    private void displayCharacters(){
        ArrayList<Players> playerList = playerbase.getPlayersArrayList();
        for (int i = 0; i < playerList.size(); i++){
            System.out.println(playerList.get(i));
        }
    }
    private void battleCharacters(){
        System.out.println("What is the first player you would like to battle??");
        String nameOne = scnr.next();

        Players getOne = playerbase.getPlayers(nameOne);

        System.out.println("What is the second player you would like to battle??");
        String nameTwo = scnr.next();

        Players getTwo = playerbase.getPlayers(nameTwo);

        if ((getOne == null) || (getTwo == null)){
            System.out.println("PLAYER(S) NOT FOUND!!");
        }
        else{
            System.out.println("These two shall fight!!!!");
            Battle battle = new Battle(getOne,getTwo);
            battle.fight();
        }

    }
}
