package entities;

import java.time.LocalDate;

public class Instalment {
    private LocalDate date;
    private Double amount;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Instalment(){
    }

    public Instalment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;
    }
}
