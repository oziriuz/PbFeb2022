package Softuniada2021;

import java.util.*;

public class SnowboardingRecursion {

    public static int getTrackFromList(List<Track> trackList, int numberOfTracks, int staminaLeft, Player competitor, List<String> tracksPassed) {
        //base negative stamina

        if (staminaLeft < 0) {
            return Integer.MIN_VALUE;
        }
        //base - no tracks in list or no stamina left = 0
        if (numberOfTracks < 0 || staminaLeft == 0) {
            return 0;
        }


        tracksPassed.add(trackList.get(numberOfTracks).name);
        System.out.println(numberOfTracks + " + " + trackList.get(numberOfTracks).name);
        //Case 1 - include current track points in list
        //recur for remaining items `numberOfTracks-1` with decreased capacity `staminaLeft-trackList.get(i).stamina`
        int include = trackList.get(numberOfTracks).points + getTrackFromList(trackList, numberOfTracks - 1,
                staminaLeft - trackList.get(numberOfTracks).stamina, competitor, tracksPassed);

        if (numberOfTracks < tracksPassed.size())
            tracksPassed.remove(numberOfTracks);
        System.out.println(numberOfTracks + " - " + trackList.get(numberOfTracks).name);
        //Case 2 - exclude current track points from list
        //recur for remaining `numberOfTracks-1`
        int exclude = getTrackFromList(trackList, numberOfTracks - 1,
                staminaLeft, competitor, tracksPassed);

        return Integer.max(include, exclude);
    }

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

        //trackList.sort(Comparator.comparingInt(Track::getStamina).thenComparing(Track::getPoints));
        trackList.sort(Comparator.comparingDouble(Track::getWorth));
//        for(int i = 0; i < tempNames.size(); i++){
//            System.out.println(trackList.get(i).name + "-" + trackList.get(i).getWorth() + "-" + trackList.get(i).points);
//        }

        Player competitor = new Player(playerStamina);

        int result = getTrackFromList(trackList, trackList.size() - 1, competitor.staminaLeft, competitor, competitor.tracksPassed);

//        for (Track track : trackList) {
//            if (competitor.canGoThisTrack(track)) {
//                result = getTrackFromList(trackList, trackList.size() - 1, competitor.staminaLeft, competitor);
//            }
//        }
        //System.out.println(result);

        competitor.tracksPassed.sort(String.CASE_INSENSITIVE_ORDER);
        StringBuilder resultTracks = new StringBuilder();
        for (int i = 0; i < competitor.tracksPassed.size(); i++) {
            resultTracks.append(competitor.tracksPassed.get(i)).append(" ");
        }
        System.out.println(resultTracks.toString().trim());
//        System.out.println(competitor.points);
//        System.out.println(competitor.staminaLeft);
        System.out.println(result);
    }

    public static class Track {
        String name;
        int stamina;
        int points;
        public Track(String name, int stamina, int points) {
            this.name = name;
            this.stamina = stamina;
            this.points = points;
        }

        public int getStamina() {
            return stamina;
        }

        public int getPoints() {
            return points;
        }

        public double getWorth() {
            return (double) points / stamina;
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

    }
}
