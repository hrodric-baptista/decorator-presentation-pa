import example.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pizza pizza1 =
                new PineappleDecorator(
                    new PepperoniDecorator(
                            new PizzaImplementation("Peppenás")
                    )
                );
        Pizza pizza2 =
                new PineappleDecorator(
                    new PepperoniDecorator(
                            new BaconDecorator(
                                    new OnionDecorator(
                                            new PizzaImplementation("Mixórdia")
                                    )
                            )
                    )
                );
        pizza1.tastesLike(null);
        pizza2.tastesLike(null);
    }
}