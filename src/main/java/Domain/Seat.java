package Domain;

public class Seat {
    private String seatType;
    private double seatPrice;


    public Seat(Builder builder) {
        this.seatType=builder.seatType;
        this.seatPrice=builder.seatPrice;
    }
    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String seatType;
        private double seatPrice;

        public Builder withSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }

        public Builder withSeatPrice(double seatPrice) {
            this.seatPrice = seatPrice;
            return this;
        }
        public Seat build(){
            return new Seat(this);
        }

    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatType='" + seatType + '\'' +
                ", seatPrice=" + seatPrice +
                '}';
    }
}

