import java.time.LocalDate;

public class PastEvents extends Event{

    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    public static final double eventCost = 10_000;
    private String paymentDetails;

    public PastEvents(LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension, String paymentDetails){
         
         this.eventStartDate = eventStartDate;
         this.eventEndDate = eventEndDate;
         this.paymentStatus = paymentStatus;
         this.requiresExtension = requiresExtension;
         this.paymentDetails = paymentDetails;
    }

    public String getPaymentStatus(){
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus){
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentDetails(){
        return paymentDetails;
    }
    public void setPaymentDetails(String paymentDetails){
        this.paymentDetails = paymentDetails;
    }

    public boolean getRequiresExtension(){
        return requiresExtension;
    }
    public void setRequiresExtension(boolean requiresExtension){
        this.requiresExtension = requiresExtension;
    }

    public LocalDate getEventStartDate(){
        return eventStartDate;
    }
    public void setEventStartDate(LocalDate eventStartDate){
        this.eventStartDate = eventStartDate;
    }

    public LocalDate getEventEndDate(){
        return eventEndDate;
    }
    public void setEventEndDate(LocalDate eventEndDate){
        this.eventEndDate = eventEndDate;
    }

    public String toString(){
        return eventStartDate + eventEndDate + paymentStatus + paymentDetails + requiresExtension;
    }

  













    
}
