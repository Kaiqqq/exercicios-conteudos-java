package entities;

public class Company extends TaxPayer {

    private Double numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Double numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return annualIncome * 0.14;
        }
        return annualIncome * 0.16;
    }
}
