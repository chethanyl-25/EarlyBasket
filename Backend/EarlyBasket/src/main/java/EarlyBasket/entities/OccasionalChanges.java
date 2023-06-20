package EarlyBasket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OccasionalChanges {
    @Id
    @SequenceGenerator(name = "occasional_changes_seq",allocationSize = 1,initialValue = 876543)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "occasional_changes_seq")
    private Long id;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    @ManyToOne
    @JoinColumn
    private Product product;

    @Column
    private float quantity;

    @Column
    private String reason;
}
