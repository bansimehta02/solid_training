package com.meditab.training.isp.exercise;

public interface Door_sensor
{
    void lock();

    void unlock();

    void open();

    void close();

    void proximityCallback();
}
