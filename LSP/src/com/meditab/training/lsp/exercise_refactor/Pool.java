package com.meditab.training.lsp.exercise;

public class Pool
{
    public static void main(String[] args)
    {
        Pool pool = new Pool();
        Duck donaldDuck = new Duck();
        donaldDuck.quack();
        donaldDuck.swim();
        Duck electricDuck = new ElectronicDuck();
        electricDuck.quack();
        electricDuck.swim();
    }
}
