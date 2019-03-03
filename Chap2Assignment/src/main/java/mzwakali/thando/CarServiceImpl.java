package mzwakali.thando;

import java.util.*;

public class CarServiceImpl implements CarInterface {

    private ArrayList cars;
    private Set make;
    private Map factoryLocation;

    public CarServiceImpl()
    {
        cars = new ArrayList();
        make = new HashSet();
        factoryLocation = new HashMap();
    }

    @Override
    public void addCarToArrayList(String item)
    {
        cars.add(item);
    }

    @Override
    public void addMakeToSet(String item)
    {
        make.add(item);
    }

    @Override
    public void addLocationToMap(String key, String value)
    {
        factoryLocation.put(key,value);
    }

    public static void main(String[] args)
    {

    }
}
