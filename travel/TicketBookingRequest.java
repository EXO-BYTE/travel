package Travellapp.travel;

class TicketBookingRequest {
    private String location;
    private String customerName;
    private String paymentStatus;
    // Other ticket booking request details

    public TicketBookingRequest(String location, String customerName) {
        this.location = location;
        this.customerName = customerName;
        this.paymentStatus = "Pending";
    }

    // Getters and setters for other properties

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }
}