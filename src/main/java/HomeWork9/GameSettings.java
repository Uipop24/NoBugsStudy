package HomeWork9;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayer(int UpdateMaxPlayers){
        maxPlayers = UpdateMaxPlayers;
    }

    public void addPlayer(){
        currentPlayers = currentPlayers + 1;
    }

    public void printGameStatus(){
        System.out.println(gameName + " " + currentPlayers + " " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game_one = new GameSettings("GameName_1", 100);
        GameSettings game_two = new GameSettings("GameName_2", 10);
        setMaxPlayer(110);
        game_one.addPlayer();
        game_two.addPlayer();
        game_one.printGameStatus();
        game_two.printGameStatus();

    }

}
