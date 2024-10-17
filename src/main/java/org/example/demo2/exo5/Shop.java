package org.example.demo2.exo5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private List<Product> products;

    public void update(Product product) {

        int oldQuality = product.getQuality();
        int oldSellIn = product.getSellIn();

        int newQuality = 0;
        int newSellIn = 0;

        if (product.getName().equals("Brie Vieilli")) {
            newQuality = oldQuality + 1;
        } else {
            if (oldQuality != 0 && oldSellIn != 0){
                newQuality = oldQuality -1;
                newSellIn = oldSellIn -1;
            } else {
                if (product.getSellIn() == 0){
                    newQuality = oldQuality - 2;
                }
            }
        }


        product.setQuality(Math.max(0, Math.min(50, newQuality)));
        product.setSellIn(Math.max(0, newSellIn));
    }

}
