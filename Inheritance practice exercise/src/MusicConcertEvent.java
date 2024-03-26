public class MusicConcertEvent extends Event implements CalculateEventCostInterface{
    private boolean merchandiseRequierd;
    private double merchandiseCost;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants,int totalEventDays, boolean merchandiseRequierd, double merchandiseCost){
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequierd=merchandiseRequierd;
        this.merchandiseCost=merchandiseCost;

    }

    public void setMerchandiseRequired(boolean merchandiseRequierd){
        this.merchandiseRequierd=merchandiseRequierd;
    }
    public boolean getMerchandiseRequired(){
        return merchandiseRequierd;
    }

    public void setMerchandiseCost(double merchandiseCost){
        this.merchandiseCost=merchandiseCost;
    }
    public double getMerchandiseCost(){
        return merchandiseCost;
    }

    @Override
    public void calculateEventCost(){
        merchandiseCost = getEventCost() + (getTotalParticipants() * getMerchandiseCost());


    }

    @Override
    public String toString(){
        return "The merchandise cost " + merchandiseCost;
    }

}
