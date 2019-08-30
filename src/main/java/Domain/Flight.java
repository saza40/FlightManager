package Domain;


import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Flight {

    private String flightName;

    private String flightNumber;

    private String flightDestination;

    private LinkedList<Seat> economySeat;


    private LinkedList<Seat> businessSeat;

    private Flight() {

    }

    private Flight(Builder builder) {
        this.flightName = Objects.requireNonNull(builder.flightName, "flightName should not be null");
        this.flightNumber = Objects.requireNonNull(builder.flightNumber, "flightNumber should not be null");
        this.flightDestination = Objects.requireNonNull(builder.flightDestination, "FlightDestination should not be null");
        this.economySeat = builder.economySeat;
        this.businessSeat = builder.businessSeat;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LinkedList<Seat> getEconomySeat() {
        return economySeat;
    }

    public void setEconomySeat(LinkedList<Seat> economySeat) {
        this.economySeat = economySeat;
    }

    public LinkedList<Seat> getBusinessSeat() {
        return businessSeat;
    }

    public void setBusinessSeat(LinkedList<Seat> businessSeat) {
        this.businessSeat = businessSeat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String flightName;

        private String flightNumber;

        private String flightDestination;

        private LinkedList<Seat> economySeat = new LinkedList<Seat>();

        private LinkedList<Seat> businessSeat = new LinkedList<Seat>();


        public Builder withFlightDestination(String flightDestination) {
            this.flightDestination = flightDestination;
            return this;
        }

        public Builder withFlightName(String flightName) {
            this.flightName = flightName;
            return this;
        }

        public Builder withFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder withEconomySeat(LinkedList<Seat> economySeat) {
            this.economySeat = economySeat;
            return this;
        }

        public Builder withBusinessSeat(LinkedList<Seat> businessSeat) {
            this.businessSeat = businessSeat;
            return this;
        }


        public Flight build() {
            return new Flight(this);
        }
    }


}
