package EarlyBasket.entities;

import EarlyBasket.entities.keys.ShopOwnersKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopOwners {
    @EmbeddedId
    private ShopOwnersKey shopOwnersKey;

    @ManyToOne
    @MapsId("shopId")
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne
    @MapsId("ownerId")
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
