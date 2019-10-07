package Ex1;

import java.util.ArrayList;
import java.util.List;

public class LeagueManagerImpl implements LeagueManager {

    private static List<SC2Player> playerList = new ArrayList<SC2Player>();

    @Override
    public void addPlayer(SC2Player player) {
        playerList.add(player);
    }

    @Override
    public void removePlayer(SC2Player player) {
        playerList.remove(player);
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
        SC2Player[] outcome = new SC2Player[playerList.size()];
        for (int idx = 0; idx < playerList.size(); idx ++){
            outcome[idx] = playerList.get(idx);
        }
        return outcome;
    }

    @Override
    public SC2Player[] getPlayers(League league) {
        SC2Player[] outcome = new SC2Player[playerList.size()];
        for (int idx = 0; idx < playerList.size(); idx ++){
            if (playerList.get(idx).getLeague().equals(league)) {
                outcome[idx] = playerList.get(idx);
            }
        }
        return outcome;
    }

    @Override
    public SC2Player[] getPlayers(Race race) {
        SC2Player[] outcome = new SC2Player[playerList.size()];
        for (int idx = 0; idx < playerList.size(); idx ++){
            if (playerList.get(idx).getRace().equals(race)) {
                outcome[idx] = playerList.get(idx);
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
