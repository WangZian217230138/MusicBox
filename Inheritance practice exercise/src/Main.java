public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI conference", "US", "Aminuos", 100, 100, 100, 100, 100, 100);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent("001", "abc", "Mars", "yibaminuo", 10, 10, 10, true, 10);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent);

        PastEvents pastEvents = new PastEvents(1234, 1234, "Paid", false, "eventCost");

    }
}
