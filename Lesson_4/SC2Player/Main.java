package Lesson4;

public class Main {

    public static void main(String[] args) {

        SC2Player pl1 = new SC2Player("Bob", League.DIAMOND, Race.ZERG);
        SC2Player pl2 = new SC2Player("Mark", League.SILVER, Race.PROTOSS);
        SC2Player pl3 = new SC2Player("Tony", League.GOLD, Race.ZERG);
        SC2Player pl4 = new SC2Player("Gorks", League.PLATINUM, Race.ZERG);

        LeagueManager leagueManager = new LeagueManagerImpl();
        leagueManager.addPlayer(pl1);
        leagueManager.addPlayer(pl2);
        leagueManager.addPlayer(pl3);
        leagueManager.addPlayer(pl4);

        SC2Player[] newList = leagueManager.getAllPlayers();
        for(int i=0; i<newList.length; i++){
            System.out.println(newList[i]);
        }

        SC2Player pl1Clone = new SC2Player("Bob", League.DIAMOND, Race.ZERG);
        leagueManager.removePlayer(pl1Clone);
        System.out.println();

        SC2Player[] newList2 = leagueManager.getAllPlayers();
        for(int i=0; i<newList2.length; i++){
            System.out.println(newList[i]);
        }

//        SC2Player[] newList2 = leagueManager.getAllPlayers();
//        for(int i=0; i<newList2.length; i++){
//            System.out.println(newList2[i]);
//        }
//        System.out.println();
//
//        SC2Player[] newList3 = leagueManager.getPlayers(Race.ZERG);
//        for(int i=0; i<newList3.length; i++){
//            System.out.println(newList3[i]);
//        }
//        System.out.println();
//
//        SC2Player[] newList4 = leagueManager.getPlayers(League.GOLD);
//        for(SC2Player newPlaer4 : newList4){
//            System.out.println(newPlaer4);
//        }
//        System.out.println();
//
//        leagueManager.addPoints("Mark", 100);
//        System.out.println(leagueManager.getPlayer("Mark"));

    }
}
