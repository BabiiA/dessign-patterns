package com.factory.method.italian;

import com.factory.method.Pizza;
import com.factory.method.PizzaStore;

public class ItalianPizzaStore implements PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        return ItalianPizzaType.getPizzaType(pizzaType).getFactory().get();
    }

}
