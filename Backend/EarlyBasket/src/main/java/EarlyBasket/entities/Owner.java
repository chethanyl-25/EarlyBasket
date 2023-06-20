package EarlyBasket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    @Id
    @SequenceGenerator(name = "owner_seq", initialValue = 6649853,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "owner_seq")
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private int phoneNo;
}
