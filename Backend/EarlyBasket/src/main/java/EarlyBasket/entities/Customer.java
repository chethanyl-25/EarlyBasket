package EarlyBasket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_seq",allocationSize = 1, initialValue = 122321)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customer_seq")
    private long id;

    @Column
    private String FirstName;

    @Column
    private String LastName;

    @Column(columnDefinition = "varchar(500)")
    private String address;
    @Column
    private String email;

    @Column
    private int phoneNo;

    @Column
    private String password;

}
