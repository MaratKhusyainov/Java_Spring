package ru.geekbrains.Hometask6.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product_table")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "title_field")
    private String title;
    @Column(name = "cost_field")
    private int cost;

    @ManyToMany()
    @JoinTable(name = "customer_product_table",
            joinColumns = @JoinColumn(name = "product_field"),
            inverseJoinColumns = @JoinColumn(name = "customer_field"))
    private List<Customer> customerList;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
