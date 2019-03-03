package mzwakali.thando;

import AppConfig.AppConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarTest {
    private CarInterface car;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        car = (CarInterface) ctx.getBean("car");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addCarToArrayList() throws Exception {

        String car1 = "BMW";

        car.addCarToArrayList(car1);

        Assert.assertEquals( car1, car1);

    }

    @Test
    public void addMakeToSet() throws Exception {

        String make1 = "Volkswagen";
        String make2 = "Mercedes";
        String make3 = "BMW";

        car.addMakeToSet(make1);
        car.addMakeToSet(make2);
        car.addMakeToSet(make3);

        Assert.assertNotSame( make1, make2);
    }

    @Test
    public void addLocationToMap() throws Exception {

        String key = "mzb";
        String val = "Mozambique";

        car.addLocationToMap(key, val);

        Assert.assertNotNull(val);

    }
}

