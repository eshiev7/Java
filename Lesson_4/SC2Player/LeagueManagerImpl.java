package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeagueManagerImpl implements LeagueManager {

    private static List<SC2Player> playerList = new ArrayList<SC2Player>();
    public static Map<League, Integer> leagueMap = new HashMap<League, Integer>();
    public static Map<Race, Integer> raceMap = new HashMap<Race, Integer>();

    @Override
    public void addPlayer(SC2Player player) {
        playerList.add(player);

        if(leagueMap.containsKey(player.getLeague())){
            int newCount1 = leagueMap.get(player.getLeague());
            newCount1 ++;
            leagueMap.put(player.getLeague(),newCount1);
        } else {
            leagueMap.put(player.getLeague(),1);
        }

        if(raceMap.containsKey(player.getRace())){
            int newCount = raceMap.get(player.getRace());
            newCount ++;
            raceMap.put(player.getRace(),newCount);
        } else {
            raceMap.put(player.getRace(),1);
        }
    }

    @Override
    public void removePlayer(SC2Player player) {
//        for (int idx = 0; idx < playerList.size(); idx++) {
//            if (playerList.get(idx).equals(player)) {
//                playerList.remove(idx);
//            }
//        }
        playerList.remove(player);
        if(raceMap.containsKey(player.getRace())) {
            int newCount = raceMap.get(player.getRace());
            newCount--;
            raceMap.put(player.getRace(), newCount);
        }
        if(leagueMap.containsKey(player.getLeague())) {
            int newCount1 = leagueMap.get(player.getLeague());
            newCount1--;
            leagueMap.put(player.getLeague(), newCount1);
        }
    }

    @Override
    public SC2Player getPlayer(String name) {
        for (int idx = 0; idx < playerList.size(); idx++) {
            if (playerList.get(idx).getNickName().equals(name)) {
                return playerList.get(idx);
            }
        }
        return null;
    }

    @Override
    public SC2Player[] getAllPlayers() {
//        SC2Player[] outcome = new SC2Player[playerList.size()];
//        for (int idx = 0; idx < playerList.size(); idx ++){
//            outcome[idx] = playerList.get(idx);
//        }
        return playerList.toArray(new SC2Player[playerList.size()]);
    }

    @Override
    public SC2Player[] getPlayers(League league) {
        SC2Player[] outcome = new SC2Player[leagueMap.get(league)];
        int counter1 = 0;
        for (int idx = 0; idx < playerList.size(); idx ++){
            if (playerList.get(idx).getLeague().equals(league)) {
                outcome[counter1] = playerList.get(idx);
                counter1 ++;
            }
        }
        return outcome;
    }

    @Override
    public SC2Player[] getPlayers(Race race) {
        SC2Player[] outcome = new SC2Player[raceMap.get(race)];
        System.out.println(raceMap.get(Race.ZERG));
        System.out.println(raceMap.get(race));
        int counter1 = 0;
        for (int idx = 0; idx < playerList.size(); idx ++){
            if (playerList.get(idx).getRace().equals(race)) {
                outcome[counter1] = playerList.get(idx);
                counter1 ++;
            }
        }
        return outcome;
    }

    @Override
    public void addPoints(String name, int points) {
        for (int idx = 0; idx < playerList.size(); idx++) {
            if (playerList.get(idx).getNickName().equals(name)) {
                playerList.get(idx).setPoints(points);
            }
        }
    }
}
