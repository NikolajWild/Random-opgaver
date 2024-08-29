import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {
    private Scanner scanner;
    private List<Cyclist> cyclists;

    public Statistics(String filename) throws FileNotFoundException{
        TDFFileReader tdfFileReader = new TDFFileReader(filename);
        cyclists = tdfFileReader.readFile();
    }
    public Set<String> getTeams(){
        Set<String> teams = new HashSet<>();
        for (Cyclist c : cyclists){
            for (String cyclist : c.getTeams()){
                teams.add(cyclist);
            }
        }
        return teams;
    }
    public Map<String, Set<String>> getTeamsWithMembers(){
        Map<String, Set<String>> teamsWithMembers = new HashMap<>();
        for (Cyclist c : cyclists){
            for (String team : c.getTeams()){
                teamsWithMembers.putIfAbsent(team, new HashSet<>());

                teamsWithMembers.get(team).add(c.getMember());
            }
        }
        return  teamsWithMembers;
    }

    public Set<Cyclist> getTeamMembers(String team) {
        Set<Cyclist> teamMembers = new HashSet<>();

        // Iterate through all cyclists
        for (Cyclist c : cyclists) {
            // Check if the cyclist is a member of the specified team
            if (c.getTeams().contains(team)) {
                // Add the cyclist to the set of team members
                teamMembers.add(c);
            }
        }

        return teamMembers;
    }
}
