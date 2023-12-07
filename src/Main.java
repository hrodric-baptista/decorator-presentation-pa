import example.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PineappleDecorator pineapple = new PineappleDecorator(null);
        PepperoniDecorator pepperoni = new PepperoniDecorator(null);

        PepperoniDecorator extraPepperoni = new PepperoniDecorator(null, 2); // EXEMPLO COM EXTRA.

        /*
            Exemplo 1. Fácil de remover/adicionar ingredientes.
            Ainda temos as referências. Guardar num HashMap? Porquê?
        */
        Pizza pizza1 = pineapple.addTopping(pepperoni.addTopping(new PizzaImplementation("Peppenás")));;

        /*
            Exemplo 2. Difícil de remover/adicionar ingredientes.
            Perdemos as referências.
        */
        Pizza pizza2 =
                new PineappleDecorator(
                    new PepperoniDecorator(
                            new BaconDecorator(
                                    new OnionDecorator(
                                            new PizzaImplementation("Mixórdia")
                                    )
                            ),
                            3
                    )
                );
        pizza1.tastesLike(null);
        System.out.println(pizza1.getCost());

        System.out.println("Após remoção do pepperoni.");
        pizza1.removeTopping(pepperoni);
        pizza1.tastesLike(null);
        System.out.println(pizza1.getCost());

        pizza2.tastesLike(null);
        System.out.println(pizza2.getCost());
    }
}