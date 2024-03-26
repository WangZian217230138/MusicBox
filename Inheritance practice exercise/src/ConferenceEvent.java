public class ConferenceEvent extends Event implements CalculateEventCostInterface{

    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    private double conferenceEventCost;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants,int totalEventDays, double breakfastCost, double lunchCost, double dinnerCost){
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
    }

    public boolean getBreakfastRequired(){
        return breakfastRequired;
    }
    public void setBreakfastRequired(boolean breakfastRequired){
        this.breakfastRequired=breakfastRequired;
    }

    public boolean getLunchRequired(){
        return lunchRequired;
    }
    public void setLunchRequired(boolean lunchRequired){
        this.lunchRequired=lunchRequired;
    }

    public boolean getDinnerRequired(){
        return dinnerRequired;
    }
    public void setDinnerRequired(boolean dinnerRequired){
        this.dinnerRequired=dinnerRequired;
    }

    public double getBreakfastCost(){
        return breakfastCost;
    }
    public void setBreakfastCost(double breakfastCost){
        this.breakfastCost=breakfastCost;
    } 

    public double getLunchCost(){
        return lunchCost;
    }
    public void setLunchCost(double lunchCost){
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost(){
        return dinnerCost;
    }
    public void setDinnerCost(double dinnerCost){
        this.dinnerCost = dinnerCost;
    }

    @Override
    public void calculateEventCost(){
        conferenceEventCost = getEventCost() + ((getBreakfastCost() + getLunchCost() + getDinnerCost()) * getTotalParticipants());

    }

    @Override
    public String toString(){
        return "Conference Event details : " + "\n" + 
        "Event ID : " + getEventID() + "\n" + 
        "Event Name : " + getEventName() + "\n" + 
        "Event Location : " + getEventLocation() + "\n" + 
        "Total participants : " + getTotalParticipants() + "\n" + 
        "Total Conference Cost : " + conferenceEventCost;
    }

}
