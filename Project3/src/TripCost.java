class TripCost {
    public static final double KILOMETERS_PER_MILE = 1.609347;
    public static final double LITERS_PER_GALLON = 3.78541178;
    public static final double MILES_PER_KM_PER_LITER = LITERS_PER_GALLON / KILOMETERS_PER_MILE;

    private final double distance;
    private final double gasCost;
    private final double mileage;
    private final int days;
    private final double hotelCost;
    private final double foodCost;
    private final double attractionsCost;

    public TripCost(double distance, double gasCost, double mileage, int days,
                    double hotelCost, double foodCost, double attractionsCost) {
        this.distance = distance;
        this.gasCost = gasCost;
        this.mileage = mileage;
        this.days = days;
        this.hotelCost = hotelCost;
        this.foodCost = foodCost;
        this.attractionsCost = attractionsCost;
    }

    public double getTotalCost() {
        double fuelCost = (distance / mileage) * gasCost;
        double lodgingAndFood = (hotelCost + foodCost) * days;
        return fuelCost + lodgingAndFood + attractionsCost;
    }
}