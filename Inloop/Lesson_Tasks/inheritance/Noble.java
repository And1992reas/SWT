class Noble extends Inhabitant
{
    @Override
    public int tax()
    {
        int tax = (int) Math.floor(taxableIncome()*taxRate);

        return Math.max(20, tax);
    }
}