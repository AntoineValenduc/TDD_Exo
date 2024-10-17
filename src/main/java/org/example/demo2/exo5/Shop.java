package org.example.demo2.exo5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.demo2.exo5.exceptions.NotImplementedException;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private List<Product> products;

    public void update(Product product) {
        //throw new NotImplementedException();
    }

}
