package com.meditab.training.lsp.exercise;

public class Duck implements source
{
	@overwrite
    public void quack()
    {
        System.out.println("Quack...");
    }
	@overwrite
    public void swim()
    {
        System.out.println("Swim...");
    }
}
