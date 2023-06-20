package EarlyBasket.entities.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopsCustomerKey {
    @Column
    private Long shopId;

    @Column
    private Long customerId;

    @Column(columnDefinition = "varchar(255) default \"pending\"")
    private String status;
}
