package Ex1;



public class Main {

    public static void main(String[] args) {

        SC2Player pl1 = new SC2Player("Bob", League.DIAMOND, Race.TERRAN);

		LeagueManager.addPlayer(pl1);
	    LeagueManager.addPlayer("Mark", League.SILVER, Race.PROTOSS);
	    LeagueManager.addPlayer("Tony", League.GOLD, Race.ZERG);
	    LeagueManager.addPlayer("Gorks", League.PLATINUM, Race.ZERG);
    }
}
