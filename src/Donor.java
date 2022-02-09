public class Donor {
    private String name;
    private Double amount;
    public Donor(String n, Double a) {
        name = n;
        amount = a;
    }

    public String getName(){
        return name;
    }
    public Double getAmount() {
        return amount;
    }


}
