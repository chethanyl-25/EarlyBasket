package EarlyBasket.entities;

import EarlyBasket.entities.keys.ShopsCustomerKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopsCustomer {
    @EmbeddedId
    private ShopsCustomerKey shopsCustomerKey;

    @ManyToOne
    @MapsId("shopId")
    @JoinColumn
    private Shop shop;

    @ManyToOne
    @MapsId("customerId")
    @JoinColumn
    private Customer customer;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private String servicesProvided;

}
