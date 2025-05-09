import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String teamCode;
    private List<Player> players;
    private Coach coach;

    public Team(String name, String teamCode) {
        this.name = name;
        this.teamCode = teamCode;
        this.players = new ArrayList<>();
        this.coach = null;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Coach getCoach() {
        return coach;
    }

}
