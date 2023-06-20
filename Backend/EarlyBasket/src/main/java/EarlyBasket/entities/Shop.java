package EarlyBasket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    @Id
    @SequenceGenerator(name = "shop_seq",allocationSize = 1,initialValue = 54321)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "shop_seq")
    private Long id;

    @Column
    private String name;

    @Column
    private int phoneNo;

    @Column(columnDefinition = "varchar(500)")
    private String address;

    @Column
    private String email;

    @Column
    private long gstIn;

    @Column
    private String password;

    @Column(columnDefinition = "varchar(255) default \"pending\"")
    private String status;

    @OneToMany(mappedBy = "shop")
    private Set<ShopOwners> shopOwners;

    @OneToMany(mappedBy = "shop")
    private Set<ServicesProvided> servicesProvided;
}
