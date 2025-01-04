package entities;

public class TaxPayar {

    private String name;
    private Double anualIncome;

    public TaxPayar(){
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnualIncome() {
        return anualIncome;
    }
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    public TaxPayar(String name, Double anualIncome) {
        super();
        this.name = name;
        this.anualIncome = anualIncome;
    }


    
}
