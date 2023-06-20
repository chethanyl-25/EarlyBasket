package EarlyBasket.entities;

import EarlyBasket.entities.keys.ServicesProvidedKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicesProvided {
    @EmbeddedId
    private ServicesProvidedKey servicesProvidedKey;

    @ManyToOne
    @MapsId("shopId")
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @Column
    private String availableProducts;
}
