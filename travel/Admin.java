package Travellapp.travel;

class Admin {
    private Map<String, Location> locations;
    private List<TicketBookingRequest> ticketBookingRequests;
    private List<String> feedbacks;
    // Other admin-related properties and methods

    public Admin() {
        this.locations = new HashMap<>();
        this.ticketBookingRequests = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
    }

    public void addLocation(String name) {
        locations.put(name, new Location(name));
    }

    public void addHotelToLocation(String locationName, String hotel) {
        locations.get(locationName).addHotel(hotel);
    }

    public void addCabToLocation(String locationName, String cab) {
        locations.get(locationName).addCab(cab);
    }

    public void addTouristSpotToLocation(String locationName, String spot) {
        locations.get(locationName).addTouristSpot(spot);
    }

    public void viewTicketBookingRequests() {
        for (TicketBookingRequest request : ticketBookingRequests) {
            System.out.println("Location: " + request.getLocation());
            System.out.println("Customer Name: " + request.getCustomerName());
            System.out.println("Payment Status: " + request.getPaymentStatus());
            // Print other details of the request
        }
    }

    public void confirmTicketBooking(String location, String customerName) {
        for (TicketBookingRequest request : ticketBookingRequests) {
            if (request.getLocation().equals(location) && request.getCustomerName().equals(customerName)) {
                request.setPaymentStatus("Confirmed");
                break;
            }
        }
    }
*/
    public void rejectTicketBooking(String location, String customerName) {
        for (TicketBookingRequest request : ticketBookingRequests) {
            if (request.getLocation().equals(location) && request.getCustomerName().equals(customerName)) {
                request.setPaymentStatus("Rejected");
                break;
            }
        }
    }

    public void monitorPaymentStatus() {
        for (TicketBookingRequest request : ticketBookingRequests) {
            System.out.println("Location: " + request.getLocation());
            System.out.println("Customer Name: " + request.getCustomerName());
            System.out.println("Payment Status: " + request.getPaymentStatus());
            // Print other details of the request
        }
    }

    public void viewFeedbacks() {
        for (String feedback : feedbacks) {
            System.out.println(feedback);
        }
    }
}