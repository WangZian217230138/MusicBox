public abstract class Event {

    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;

    public static final double  tax = 0.3;
    public static final double  insuranceCost = 1000.00;



    public Event(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants,int totalEventDays){
        this.eventID=eventID;
        this.eventName=eventName;
        this.eventLocation=eventLocation;
        this.eventPointOfContact=eventPointOfContact;
        this.eventCost=eventCost;
        this.totalParticipants=totalParticipants;
        this.totalEventDays=totalEventDays;
    }

    public void setEventID(String eventID){
        this.eventID=eventID;
    }
    public String getEventID(){
        return eventID;
    }

    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    public String getEventName(){
        return eventName;
    }

    public void setEventLocation(String eventLocation){
        this.eventLocation=eventLocation;
    }
    public String getEventLocation(){
        return eventLocation;
    }

    public void setEventPointOfContact(String eventPointOfContact){
        this.eventPointOfContact=eventPointOfContact;
    }
    public String getEventPointOfContact(){
        return eventPointOfContact;
    }

    public void setEventCost(double eventCost){
        this.eventCost=eventCost;
    }

    public double getEventCost(){
        return eventCost;
    }

    public void setTotalParticipants(int totalParticipants){
        this.totalParticipants=totalParticipants;
    }

    public int getTotalParticipants(){
        return totalParticipants;
    }

    public void setTotalEventDays(int totalEventDays){
        this.totalEventDays = totalEventDays;
    }
    public int getTotalEventDays(){
        return totalEventDays;
    }

    public String toString(){
        return eventID + " " + eventName + " " + eventLocation + " " + eventPointOfContact + " " + eventCost + " " + totalParticipants + " " + totalEventDays ;
    }




    

}
