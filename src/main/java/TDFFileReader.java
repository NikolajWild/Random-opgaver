import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TDFFileReader {
    File file;

    public File getFile(){
        return file;
    }


    public TDFFileReader (String filename) throws FileNotFoundException{
        this.file = new File("tdffinishers2024.csv");
    }
    public List<Cyclist> readFile() throws FileNotFoundException{
        Scanner myReader = new Scanner(file);
        List<Cyclist> cyclistList = new ArrayList<>();
        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
            String[] split = data.split(";");
            List<String> teams = new ArrayList<>();
            if (split.length > 1){
                String[] cyclist = split[2].split(";");
                teams = Arrays.asList(cyclist);
            }
            Cyclist cyclist = new Cyclist(split[1], teams);
            cyclistList.add(cyclist);
        }
        myReader.close();
        return cyclistList;

    }
}








