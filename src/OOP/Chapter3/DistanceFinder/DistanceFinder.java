package OOP.Chapter3.DistanceFinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DistanceFinder {
    static private HashMap<String, HashMap<String, Integer>> distanceTable = new HashMap<String, HashMap<String, Integer>>();
    static private ArrayList<String> cities = new ArrayList<String>();
    static private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        getCities();
        getDistanceTable();

        String from = sc.next();
        String to = sc.next();
        sc.close();
        System.out.println(distanceTable.get(from).get(to));
    }

    public static void getCities() {
        String input = "";
        while (sc.hasNext()) {
            input = sc.next();
            if (input.equals("###")) {
                break;
            }
            cities.add(input);
        }
    }

    public static void getDistanceTable() {
        for (String column : cities) {
            distanceTable.put(column, new HashMap<String, Integer>());
            for (String row : cities) {
                Integer distance = sc.nextInt();
                distanceTable.get(column).put(row, distance);
            }
        }
    }
}