package com.meditab.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
   CarDB _db = new CarDB();
   Car car = new Car();
   car=_db.getFromDb(carId);
   System.out.println(getCarsNames());
   car=getBestCar();
}
