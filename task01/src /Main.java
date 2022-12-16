import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        String csv = args[0];
        String templateFile = args[1];

        FileReader fr = new FileReader(csv);
        BufferedReader br = new BufferedReader(fr);

        Map<String, Object> data = new HashMap<>();

        String line;
        while((line = br.readLine())!= null) {
        String[] words = line.trim().split(",");
        data.put("input1", words[0]);
        data.put("input2", words[1]);
        data.put("input3", words[2]);
        data.put("input4", words[3]);

        System.out.println("filled-in");
        }
        br.close();
    }
}