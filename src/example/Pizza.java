package example;

public interface Pizza {
    /**
     * Sabor especificado.
     * @param taste O sabor, yummy.
     */
    void tastesLike(String taste);

    /**
     * Custo da pizza.
     * @return Um double com o custo da pizza.
     */
    int getCost();

    /**
     * Devolve a Pizza ou o TOPPING * ATENÇÃO *
     * @return Pizza que pode segurar a Pizza ou o Topping (CAST).
     */
    Pizza getPizza();

    /**
     * Remove a Pizza ou o TOPPING * ATENÇÃO *
     * @param remove Topping a remover, ou pizza.
     */
    void removeTopping(Pizza remove);

    /**
     * Adiciona a Pizza ou o TOPPING * ATENÇÃO *
     *
     * @param add Topping a adicionar, ou pizza.
     * @return
     */
    Pizza addTopping(Pizza add);
}
