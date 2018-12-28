package com.meditab.training.ocp.exercise;

public abstract class Resource
{
    private static final int INVALID_RESOURCE_ID = -1;
    public int allocate();
    public void free(int resourceId);
}