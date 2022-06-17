import java.text.NumberFormat;
import java.util.ArrayList;

public class CarpetCalculator implements Calculatable {

    //Data members

    private float pricePerSquareft;
    private boolean toApplyInstallationCharge;
    private float installationCharge = 500.0f;
    private ArrayList<Room> rooms = new ArrayList<>();
    private float totalCost;
    private float totalCostWithDiscount;
    private float discount;

    //Constructors

    public CarpetCalculator(float pricePerSquareft) {
        this.pricePerSquareft = pricePerSquareft;
    }

    public CarpetCalculator(float pricePerSquareft, float installationCharge) {
        this.pricePerSquareft = pricePerSquareft;
        this.installationCharge = installationCharge;
        toApplyInstallationCharge = true;
    }

    // Public Methods

    @Override
    public void addRoom(Room room) {rooms.add(room);
    }

    @Override
    public String getTotalCost() {
        calculateTotal();
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(totalCostWithDiscount);
    }

    @Override
    public void addPercentDiscount(float declaredDiscount) {    // parameterizing discount
        discount = declaredDiscount / 100;
    }


    public void calculateTotal() {
        for (Room r : rooms) {
            totalCost += (r.getArea() * pricePerSquareft);
        }
        if (toApplyInstallationCharge == true) {
            totalCost = totalCost + installationCharge;
        }
        totalCostWithDiscount = (totalCost - (totalCost * discount));

}}

