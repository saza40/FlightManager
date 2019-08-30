package Domain;

public class Ticket {
    private String reservationId;
    private Flight flight;
    private Passenger passenger;
    private Seat seat;
    private Food food;
    private Finance totalPrice;

    public Ticket(Builder builder) {
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Finance getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Finance totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String reservationId;
        private Flight flight;
        private Passenger passenger;
        private Seat seat;
        private Food food;
        private Finance totalPrice;

        public Builder withReservationId(String reservationId) {
            this.reservationId = reservationId;
            return this;
        }

        public Builder withFlight(Flight flight) {
            this.flight = flight;
            return this;
        }

        public Builder withPassenger(Passenger passenger) {
            this.passenger = passenger;
            return this;
        }

        public Builder withSeat(Seat seat) {
            this.seat = seat;
            return this;
        }

        public Builder withFood(Food food) {
            this.food = food;
            return this;
        }

        public Builder withTotalPrice(Finance totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Ticket build(){
            return new Ticket(this);
        }

    }

}
