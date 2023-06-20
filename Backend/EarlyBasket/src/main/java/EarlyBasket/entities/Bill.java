package EarlyBasket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @SequenceGenerator(name = "bill_seq",initialValue = 34568765,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bill_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Customer customer;

    @Column
    private String month;

    @Column(columnDefinition = "year")
    private int year;

    @Column(precision = 2)
    private float billAmount;

    @Column(precision = 2,columnDefinition = "float default 0.00")
    private  float amountPaid;

    @Column
    private File bill;
}

