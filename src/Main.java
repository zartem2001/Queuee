import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya",
                "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> firstPlusFriends = new LinkedList<>(firstClients);
        while (!firstPlusFriends.isEmpty()) {
            String firstClient = firstPlusFriends.element();
            String friend = "friend of " + firstClient;
            System.out.println(firstPlusFriends.poll() + " Покинула очередь ");

            if (Math.random() < 0.5) {
                firstPlusFriends.offer(friend);
                System.out.println("");
            } else {
                System.out.println("Друг " + firstClient + " не записался");
            }
        }
        System.out.println("Очередь закончилась!");
    }
}