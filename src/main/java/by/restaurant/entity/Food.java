package by.restaurant.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "food_table")
@Data
@NoArgsConstructor

public class Food {
@Column
    private Long id;
@Column
    private String name;
@Column
    private String description;
@Column
public int price;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

}
