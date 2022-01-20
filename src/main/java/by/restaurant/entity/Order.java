package by.restaurant.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_table")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @Column
    private Long id;
    @Column
    private int date;
    @Column
    private String paid;
    @Column
    private Long worker_id;
    @Column
    private Long users_id;

    @OneToMany
    List<ListShop> listshops;
}
