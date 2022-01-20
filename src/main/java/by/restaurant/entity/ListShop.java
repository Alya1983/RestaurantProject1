package by.restaurant.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "listshop_table")
@Data
@NoArgsConstructor
public class ListShop {

    @Id
    @Column
    private Long id;
    @Column
    private int quantity;
    @Column
    private int price;
    @Column
    private int food_id;
    @Column
    private int order_id;

    @ManyToOne
    Order order;

    @ManyToOne
    Food food;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
