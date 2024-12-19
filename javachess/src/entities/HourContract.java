package entities;
import java.util.Date;

public class HourContract {
    private Date data;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(){
    }
    public HourContract(Date data, Double valuePerHour, Integer hour) {
        this.data = data;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double totalValue(){
        return valuePerHour * hour;
    }

}