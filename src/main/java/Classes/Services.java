package Classes;

public class Services {
    private String name;
    private double tariff;
    private int count;

    public Services(String name, double tariff, int count) {
        this.name = name;
        this.tariff = tariff;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTariff() {
        return tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
