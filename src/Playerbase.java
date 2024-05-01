import java.util.ArrayList;
public class Playerbase {
    //Instance
    private ArrayList<Players> playersArrayList = new ArrayList<>();
    //Methods
    public void addPlayer(Players player){
        playersArrayList.add(player);
    }
    public void removePlayer(Players player){
        playersArrayList.remove(player);
    }
    public ArrayList<Players> getPlayersArrayList(){
        return playersArrayList;
    }
    public Players getPlayers(String playerName){
        Players foundPlayer = null;
        for(Players player : playersArrayList){
            if(player.getName().equals(playerName)){
                foundPlayer = player;
                break;
            }
        }
        return foundPlayer;
    }
}
