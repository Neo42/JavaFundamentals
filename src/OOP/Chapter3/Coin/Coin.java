package OOP.Chapter3.Coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer, String> coinNames = new HashMap<Integer, String>();

    public Coin() {
        coinNames.put(1, "penny");
        coinNames.put(10, "dime");
        coinNames.put(25, "quarter");
        coinNames.put(50, "half-dollar");
        coinNames.put(50, "五毛");
        System.out.println(coinNames.keySet().size());
        System.out.println(coinNames);
        for (Integer k : coinNames.keySet()) {
            String s = coinNames.get(k);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        sc.close();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(name);
    }

    public String getName(int amount) {
        if (!coinNames.containsKey(amount)) {
            return "NOT FOUND";
        }
        return coinNames.get(amount);
    }
}
