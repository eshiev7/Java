package Ex1;

public class SC2Player {

    private String nickName;
    private int points;
    private League league;
    private Race race;

    public SC2Player(String nickName, League league, Race race){
        this.league = league;
        this.nickName = nickName;
        this.points = 0;
        this.race = race;
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getPoints() {
        return this.points;
    }

    public Race getRace() {
        return this.race;
    }

    public League getLeague() {
        return this.league;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}





