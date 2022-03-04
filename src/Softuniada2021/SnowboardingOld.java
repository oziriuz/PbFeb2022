
package Softuniada2021;

import java.util.*;

public class SnowboardingOld {

    public static class Track {
        String name;
        int stamina;
        int points;

        public Track(String name, int stamina, int points) {
            this.name = name;
            this.stamina = stamina;
            this.points = points;
        }

        public int getPoints() {
            return points;
        }

        public int getWorth() {
            return points - stamina;
        }
    }

    public static class Player {
        int staminaInitial;
        int staminaLeft;
        int points;

        List<String> tracksPassed = new ArrayList<>();

        public Player(int staminaInitial) {
            this.staminaInitial = staminaInitial;
            this.staminaLeft = staminaInitial;
        }

        public boolean canGoThisTrack(Track track) {
            return this.staminaLeft >= track.stamina;
        }

        public void goThisTrack(Track track) {
            this.staminaLeft -= track.stamina;
            this.points += track.points;
            tracksPassed.add(track.name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerStamina = Integer.parseInt(scanner.nextLine().trim());
        List<String> tempNames = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));
        List<String> tempStamina = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));
        List<String> tempPoints = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));

        List<Track> trackList = new ArrayList<>();

        for(int i = 0; i < tempNames.size(); i++){
            Track track = new Track(tempNames.get(i), Integer.parseInt(tempStamina.get(i)), Integer.parseInt(tempPoints.get(i)));
            trackList.add(track);
        }

        trackList.sort(Comparator.comparingInt(Track::getWorth).thenComparingInt(Track::getPoints).reversed());

        Player competitor = new Player(playerStamina);

        for (Track track : trackList) {
            if (competitor.canGoThisTrack(track)) {
                competitor.goThisTrack(track);
            }
        }
        Collections.sort(competitor.tracksPassed, String.CASE_INSENSITIVE_ORDER);

        StringBuilder resultTracks = new StringBuilder();
        for (int i = 0; i < competitor.tracksPassed.size(); i++) {
            resultTracks.append(competitor.tracksPassed.get(i)).append(" ");
        }
        System.out.println(resultTracks.toString().trim());
        System.out.println(competitor.points);
        System.out.println(competitor.staminaLeft);
    }
}