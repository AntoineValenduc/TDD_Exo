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

        if (product.getSellIn() == 0){
            product.setQuality(oldQuality - 2);
        } else {
            product.setQuality(oldQuality - 1);
            product.setSellIn(oldSellIn - 1);
        }

    }

}
