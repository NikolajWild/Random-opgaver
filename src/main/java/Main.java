import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TDFFileReader tdfFileReader = new TDFFileReader("tdffinishers.csv");
        tdfFileReader.readFile();
    Statistics statistics = new Statistics("tdffinishers.csv");
        System.out.println(statistics.getTeams());
        System.out.println(statistics.getTeamsWithMembers());
        System.out.println(statistics.getTeamMembers("BAHRAIN VICTORIOUS"));

    }
}
