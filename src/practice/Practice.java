package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("bemenet.txt"));
            List<Robot> robot = new ArrayList<>();
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                robot.add(new Robot(0, 0, line));
            }
            
            // első feladat
            for(Robot r : robot){
                r.getEnd(0, 0);
            }
        } catch (Exception e) {
        }
    }

}
