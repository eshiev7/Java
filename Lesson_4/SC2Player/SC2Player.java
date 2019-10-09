package Lesson4;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "SC2Player{" +
                "nickName='" + nickName + '\'' +
                ", points=" + points +
                ", league=" + league +
                ", race=" + race +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SC2Player sc2Player = (SC2Player) o;
        return
                Objects.equals(nickName, sc2Player.nickName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, points, league, race);
    }
}
