public class Center {
    private String name;
    private int total;
    private int actualtotal;
    private int actualparcial;

    public Center(String name, int total) {
        this.name = name;
        this.total = total;
        this.actualtotal = 0;
        this.actualparcial = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getActualparcial() {
        return actualparcial;
    }

    public int getActualtotal() {
        return actualtotal;
    }

    public void setActualparcial(int actualparcial) {
        this.actualparcial = actualparcial;
    }

    public void setActualtotal(int actualtotal) {
        this.actualtotal = actualtotal;
    }

    public double getPercentageTotal() {
        return (double)actualtotal/total * 100;
    }

    public double getPercentageParcial() {
        return (double)actualparcial/total * 100;
    }

    public void applyTotal() {
        // simulador de aumento de vacunados
        actualtotal += 50;
    }

    public void applyParcial() {
        // simulador de aumento de vacunados
        actualparcial += 50;
    }
}
