package ar.mikellbobadilla.curita.article.entity;

import ar.mikellbobadilla.curita.industry.entity.Industry;
import ar.mikellbobadilla.curita.supplier.entity.Supplier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "articles")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(40) NOT NULL")
    private String article;
    @Column(columnDefinition = "INT NOT NULL CHECK(stock >= 0)")
    private Integer stock;
    @Column(columnDefinition = "INT NOT NULL CHECK(stock >= 0)")
    private Integer orderPoint;
    @Column(columnDefinition = "DECIMAL(10,2) NOT NULL CHECK(price >= 0)")
    private BigDecimal price;
    @Column(columnDefinition = "DECIMAL(10,2) NOT NULL CHECK(price >= 0)")
    private BigDecimal cost;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Industry industry;
    @Column(columnDefinition = "VARCHAR(20) NOT NULL", unique = true)
    private String barcode;
    @Column(columnDefinition = "VARCHAR(50)")
    private String observation;
}
