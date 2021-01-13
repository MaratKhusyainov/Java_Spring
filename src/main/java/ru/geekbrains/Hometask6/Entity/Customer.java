package ru.geekbrains.Hometask6.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;
    @Column(name = "name_field")
    private String name;
    @ManyToMany()
    @JoinTable(name = "customer_product_table",
            joinColumns = @JoinColumn(name = "customer_field"),
            inverseJoinColumns = @JoinColumn(name = "product_field"))
    private List<Product> productList;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
