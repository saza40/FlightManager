package Domain;

import java.util.Objects;

public class Passenger {

    private String passengerName;

    private String passengerId;

    private Passenger(Builder builder) {
        this.passengerName = builder.passengerName;
        this.passengerId =builder.passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String passengerName;

        private String passengerId;

        public Builder withPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }

        public Builder withPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }

        public Passenger build() {
            return new Passenger(this);
        }
    }

}
