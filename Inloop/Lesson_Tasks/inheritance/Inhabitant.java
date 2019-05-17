class Inhabitant
{
    protected int income;
    double taxRate=0.1;

    public int taxableIncome()
    {
        int taxableIncome = income;
        return taxableIncome;
    }

    public int tax()
    {
        int tax = (int) Math.floor(taxableIncome()*taxRate);

        return Math.max(1, tax);
    }

    public int setIncome(int income)
    {
        this.income = income;
        return this.income;
    }
}