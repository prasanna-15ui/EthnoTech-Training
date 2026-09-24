
package full;

// Abstraction
abstract class Payment {

    // Encapsulation
    private int amount;

    Payment(int amount) {
        this.amount = amount;
    }

    // Getter
    public int getAmount() {
        return amount;
    }

    // Abstract method
    abstract void pay();
}

// Inheritance
class UPI extends Payment {

    UPI(int amount) {
        super(amount);
    }

    // Method Overriding
    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

// Inheritance
class Card extends Payment {

    Card(int amount) {
        super(amount);
    }

    // Method Overriding
    @Override
    void pay() {
        System.out.println("Payment done using Card");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Objects
        UPI u = new UPI(500);
        Card c = new Card(1000);

        // Calling methods
        System.out.println("UPI Amount: " + u.getAmount());
        u.pay();

        System.out.println();

        System.out.println("Card Amount: " + c.getAmount());
        c.pay();

        // Polymorphism
        Payment p = new UPI(200);
        p.pay();
    }
}

