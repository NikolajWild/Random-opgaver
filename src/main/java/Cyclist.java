import java.util.List;

public class Cyclist {
    private String member;
    private List<String> teams;

    public Cyclist (String member, List<String> teams){
        this.member = member;
        this.teams = teams;
    }

    public String getMember() {
        return member;
    }

    public List<String> getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        return "Cyclist "+ member +" " + teams;
    }
}
