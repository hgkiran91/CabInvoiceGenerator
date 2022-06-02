import java.util.Objects;

public class InvoiceSummary {
    private Object averageFare;
    private int numberOfRides;
    private double totalFare;

    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRides == that.numberOfRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Objects.equals(averageFare, that.averageFare);
    }
}
