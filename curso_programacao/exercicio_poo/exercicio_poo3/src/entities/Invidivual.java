package entities;

public class Invidivual extends TaxPayer{

    private Double healthExpenditures;

    public Invidivual() {
        super();
    }

    public Invidivual(String name, Double annualIncome, Double healthSpend) {
        super(name, annualIncome);
        this.healthExpenditures = healthSpend;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (annualIncome < 20000) {
            if (healthExpenditures > 0) {
                return (annualIncome * 0.15) - (healthExpenditures * 0.5);
            }
            return annualIncome * 0.15;

        } else {
            if (healthExpenditures > 0) {
                return (annualIncome * 0.25) - (healthExpenditures * 0.5);
            }
            return annualIncome * 0.25;
        }
    }
}
