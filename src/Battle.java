public class Battle {
    private Players playerOne;
    private String playerOneName;
    private int playerOneHp;
    private int playerOneSpeed;
    private int playerOnePower;
    private Players playerTwo;
    private String playerTwoName;
    private int playerTwoSpeed;
    private int playerTwoHp;
    private int playerTwoPower;

    public Battle(Players playerOne, Players playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        this.playerOneName = playerOne.getName();
        this.playerTwoName= playerTwo.getName();

        this.playerOneHp = playerOne.getHp();
        this.playerTwoHp = playerTwo.getHp();

        this.playerOneSpeed = playerOne.getSpeed();
        this.playerTwoSpeed = playerTwo.getSpeed();

        this.playerOnePower = playerOne.getPower();
        this.playerTwoPower = playerTwo.getPower();
    }
    public void fight(){
        int i = 0;
        while (i == 0){
            if (playerOneSpeed >= playerTwoSpeed){
               if (playerOneHp > 0){
                   playerTwoHp = playerTwoHp - playerOnePower;
                   System.out.println(playerOneName + " Hits " + playerTwoName);

                   if (playerTwoHp > 0){
                       playerOneHp = playerOneHp - playerTwoPower;
                       System.out.println(playerTwoName + " Hits " + playerOneName);
                   }
                   else if(playerTwoHp < 0){
                       System.out.println(playerOneName + " Wins!!");
                       break ;
                   }
               }
               else if (playerOneHp <= 0){
                   System.out.println(playerTwoName + " Wins!!");
                   break ;
               }
            }
            else if(playerTwoSpeed > playerOneSpeed){
                if(playerTwoHp > 0){
                    playerOneHp = playerOneHp - playerTwoPower;
                    System.out.println(playerTwoName + " Hits " + playerOneName);

                    if (playerOneHp > 0){
                        playerTwoHp = playerTwoHp - playerOnePower;
                        System.out.println(playerOneName + " Hits " + playerTwoName);
                    }
                    else if(playerTwoHp < 0){
                        System.out.println(playerTwoName + " Wins!!");
                        break ;
                    }
                }
                else if(playerTwoHp <= 0){
                    System.out.println(playerOneName + " Wins!!");
                    break ;
                }
            }
        }
    }
}
