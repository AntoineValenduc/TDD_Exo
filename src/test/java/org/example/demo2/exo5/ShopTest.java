package org.example.demo2.exo5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    public Shop shop;
    public Product product;

    @Test
    public void whenMethodUpdate_thenQualityAndSellInDecrease() {

        //Arrange
        shop = new Shop();
        product = new Product("dessert", "cookie", 5, 5);

        //Act
        shop.update(product);
        List<Integer> listExpected = new ArrayList<>();
        listExpected.add(4);
        listExpected.add(4);

        List<Integer> listActual = new ArrayList<>();
        listActual.add(product.getSellIn());
        listActual.add(product.getQuality());

        //Assert
        Assertions.assertEquals(listExpected, listActual);
    }

    @Test
    public void whenMethodUpdateAndSellInEquals0_thenQualityDecreaseMultiplyBy2() {

        //Arrange
        shop = new Shop();
        product = new Product("dessert", "cookie", 0, 5);

        //Act
        shop.update(product);
        List<Integer> listExpected = new ArrayList<>();
        listExpected.add(0);
        listExpected.add(3);

        List<Integer> listActual = new ArrayList<>();
        listActual.add(product.getSellIn());
        listActual.add(product.getQuality());

        //Assert
        Assertions.assertEquals(listExpected, listActual);
    }

    @Test
    public void whenMethodUpdate_thenQualityAnsSellInNeverNegativ() {

         /*
        Exception : NotBeNegative ????
        If/While ????
         */

        //Arrange
        shop = new Shop();
        product = new Product("dessert", "cookie", 0, 0);

        //Act
        shop.update(product);
        List<Integer> listExpected = new ArrayList<>();
        listExpected.add(0);
        listExpected.add(0);

        List<Integer> listActual = new ArrayList<>();
        listActual.add(product.getSellIn());
        listActual.add(product.getQuality());

        //Assert
        Assertions.assertEquals(listExpected, listActual);
    }

    @Test
    public void whenMethodUpdate_thenQualityNeverUpper50() {

        /*
        Exception NotUpperThan50 ????
        Remplacer > 50 par 50 ????
         */

        //Arrange
        shop = new Shop();
        product = new Product("dessert", "cookie", 0, 51);

        //Act
        shop.update(product);
        List<Integer> listExpected = new ArrayList<>();
        listExpected.add(0);
        listExpected.add(50);

        List<Integer> listActual = new ArrayList<>();
        listActual.add(product.getSellIn());
        listActual.add(product.getQuality());

        //Assert
        Assertions.assertEquals(listExpected, listActual);
    }

    @Test
    public void whenMethodUpdateNamedBrieVieilli_thenQualityIncreaseInsteadOFDecreased() {

        //Arrange
        shop = new Shop();
        product = new Product("Fromage", "Brie Vieilli", 5, 5);

        //Act
        shop.update(product);

        //Assert
        Assertions.assertEquals(6, product.getQuality());
    }

    @Test
    public void whenMethodUpdateTypeLaitier_thenQualityDecreaseMultiplyBy2() {

        //Arrange
        shop = new Shop();
        product = new Product("Laitier", "Yaourt", 5, 5);

        //Act
        shop.update(product);

        //Assert
        Assertions.assertEquals(3, product.getQuality());
    }
}
