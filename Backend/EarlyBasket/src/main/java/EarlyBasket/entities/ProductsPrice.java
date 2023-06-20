package EarlyBasket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsPrice {
    @Id
    @SequenceGenerator(name="product_price_seq",initialValue = 58536855,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_price_seq")
    private long id;

    @ManyToOne
    @JoinColumn
    private Product product;

    @ManyToOne
    @JoinColumn
    private Shop shop;

    @Column
    private String month;

    @Column(columnDefinition = "year")
    private int year;

    @Column
    private int quantity;

    @Column
    private float price;


}
