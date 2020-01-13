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

            // 1.feladat
            for (Robot r : robot) {
                r.getEnd(0, 0);

            }
            // 2.feladat
            for (Robot r : robot) {
                System.out.println(Math.round(r.getDistance(0, 0)));
            }
            // 3.feladat
            int max = 0;
            for (int i = 0; i < robot.size(); i++) {
                Robot r = robot.get(i);
                if (Math.abs(r.getEndx()) > Math.abs(robot.get(max).getEndx())) {
                    max = i;
                }
            }
            System.out.println("A legmeszebb lévő robot " + Math.abs(robot.get(max).getEndx()) + " egységre van");
            // 4.feladat
            max = 0;
            for (int i = 0; i < robot.size(); i++) {
                Robot r = robot.get(i);
                if (r.getDistance(0, 0) > robot.get(max).getDistance(0, 0)) {
                    max = i;
                }
            }
            System.out.println("A legmeszebb lévő robot " + robot.get(max).getDistance(0, 0) + " egységre van");
            // 5.feladat
            for (Robot r : robot) {
                if (!r.includes(21)) {
                    System.out.println(r.toString());
                }
            }
        } catch (Exception e) {
        }
    }

}
