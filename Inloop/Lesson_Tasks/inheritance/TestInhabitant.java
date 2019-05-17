class TestInhabitant
{
    public static void main(String[] args)
    {
        Inhabitant first =  new Inhabitant();
        first.setIncome(20);
        System.out.println(first.tax());

        System.out.println(first.taxableIncome());

        King king1 = new King();

        king1.setIncome(20);
        System.out.println(king1.tax());

        System.out.println(king1.taxableIncome());

        Noble noob = new Noble();
        noob.setIncome(300);
        System.out.println(noob.tax());

        Serf soof= new Serf();
        soof.setIncome(40);
        System.out.println(soof.taxableIncome());
        System.out.println(soof.tax());

    }

}