
public class PaymentTerminal {
    private static final double AFFORD = 2.50;
    private static final double HEARTILY = 4.30;

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment        
        double change = this.isAfford(payment, AFFORD);
        if (change != payment) {
            this.money += AFFORD;
            this.affordableMeals++;
            return change;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = this.isAfford(payment, HEARTILY);
        if (change != payment) {
            this.money += HEARTILY;
            this.heartyMeals++;
            return change;
        }
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard payment) {        
        if (payment.takeMoney(AFFORD)) {
            this.affordableMeals++;
            return true;
        }        
        return false;
    }
    
    public boolean eatHeartily (PaymentCard payment) {
        if (payment.takeMoney(HEARTILY)) {
            this.heartyMeals++;
            return true;
        }        
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        if (sum >= 0) {
            this.money += sum;
            card.addMoney(sum);
        }       
    }
    
    private double isAfford(double payment, double cost) {
        double change = payment - cost;
        return (change >= 0) ? change : payment;        
    }    
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
