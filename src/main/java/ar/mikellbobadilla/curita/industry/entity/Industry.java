package ar.mikellbobadilla.curita.industry.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "industries")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Industry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(columnDefinition = "VARCHAR(25)", nullable = false)
    public String industry;
    @Column(columnDefinition = "VARCHAR(30)")
    public String observation;

}
