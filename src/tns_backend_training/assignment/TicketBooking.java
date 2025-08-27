package tns_backend_training.assignment;

public class TicketBooking{
    private String stageEvent;
    private String customer;
    private int nos;
    

    public TicketBooking(String stageEvent, String customer, int nos){
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.nos = nos;
    }
    public String getStageEvent() {

        return stageEvent;
    }
    public String getCustomer() {
        return customer;
    }
    public int getNos() {
        return nos;
    }

    public void displayDetails(){
        System.out.println("The details of the ticket booking are as follows:");
        System.out.println("Mode of Payment: " + stageEvent + "\nCustomer Name: " + customer + "\nNumber of Seats: " + nos);
    }
}

