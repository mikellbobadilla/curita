package ar.mikellbobadilla.curita.supplier.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "suppliers")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(25) NOT NULL")
    private String supplier;

    @Column(columnDefinition = "VARCHAR(20) NOT NULL")
    private String telephone;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    private String address;

    @Column(columnDefinition = "VARCHAR(50)")
    private String email;

    @Column(columnDefinition = "VARCHAR(30)")
    private String name;

    @Column(columnDefinition = "VARCHAR(25)")
    private String phone;

    @Column(columnDefinition = "VARCHAR(25) NOT NULL", unique = true)
    private String cuil;

    @Column(columnDefinition = "DATE", nullable = false)
    private Date initDate;

    @Column(columnDefinition = "VARCHAR(50)")
    private String observation;
}
