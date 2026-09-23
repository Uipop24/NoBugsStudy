package practice2;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int updateMaxPlayers){
        maxPlayers = updateMaxPlayers;
    }

    public void addPlayer(){
        currentPlayers = currentPlayers + 1;
    }

    public void printGameStatus(){
        System.out.println(gameName + " " + currentPlayers + " " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game_one = new GameSettings("IO", 5);
        GameSettings game_two = new GameSettings("pupupu", 100);
        setMaxPlayers(200);
        game_one.addPlayer();
        game_two.addPlayer();

        game_one.printGameStatus();
        game_two.printGameStatus();


    }
}
