package Softuniada2021;

import java.util.*;

public class Snowboarding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerStamina = Integer.parseInt(scanner.nextLine().trim());
        List<String> tempNames = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));
        List<String> tempStamina = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));
        List<String> tempPoints = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split(" ")));

        List<Track> trackList = new ArrayList<>();

        for (int i = 0; i < tempNames.size(); i++) {
            Track track = new Track(tempNames.get(i), Integer.parseInt(tempStamina.get(i)), Integer.parseInt(tempPoints.get(i)));
            trackList.add(track);
        }

        trackList.sort(Comparator.comparingDouble(Track::getWorth).thenComparingInt(Track::getPoints));

        for (int i = 0; i < tempNames.size(); i++) {
            System.out.println(trackList.get(i).name + "-" + trackList.get(i).getWorth() + "-" + trackList.get(i).points);
        }

        Player competitor = new Player(playerStamina);

        for (Track track : trackList) {
            if (competitor.canGoThisTrack(track)) {
                competitor.goThisTrack(track);
            }
        }
        competitor.tracksPassed.sort(String.CASE_INSENSITIVE_ORDER);

        StringBuilder resultTracks = new StringBuilder();
        for (int i = 0; i < competitor.tracksPassed.size(); i++) {
            resultTracks.append(competitor.tracksPassed.get(i)).append(" ");
        }
        System.out.println(resultTracks.toString().trim());
        System.out.println(competitor.points);
        System.out.println(competitor.staminaLeft);

    }

    public static class Track {
        final String name;
        final int stamina;
        final int points;

        public Track(String name, int stamina, int points) {
            this.name = name;
            this.stamina = stamina;
            this.points = points;
        }

        public int getPoints() {
            return points;
        }

        public double getWorth() {
            return (double) stamina / points;
        }
    }

    public static class Player {
        final int staminaInitial;
        int staminaLeft;
        int points;

        final List<String> tracksPassed = new ArrayList<>();

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
}
