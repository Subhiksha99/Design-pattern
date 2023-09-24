package org.example;

interface Bank{
    void interestRate();
}

class Sbi implements  Bank{

    @Override
    public void interestRate() {
        System.out.println("interest rate of 5% in sbi");
    }
}
class IndianBank implements  Bank{

    @Override
    public void interestRate() {
        System.out.println("interest rate of 7% in IndianBank");
    }
}
class Hdfc implements  Bank{

    @Override
    public void interestRate() {
        System.out.println("interest rate of 8% in hdfc");
    }
}

class Bankfactory{
   Bank getInterest(String name){
       if(name.equalsIgnoreCase("sbi"))
       {
           return new Sbi();
       }
       else if(name.equalsIgnoreCase("indianBank"))
       {
           return new IndianBank();
       }
       else if(name.equalsIgnoreCase("hdfc"))
       {
           return new Hdfc();
       }
       return null;
   }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Bankfactory factory=new Bankfactory();

        Sbi sbiObj=(Sbi) factory.getInterest("Sbi");
        sbiObj.interestRate();

    }
}
