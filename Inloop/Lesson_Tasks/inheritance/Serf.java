class Serf extends Peasant
{

    @Override
    public int taxableIncome()
    {
        int taxableIncome = income-12;
        return  Math.max(0, taxableIncome);
    }
}