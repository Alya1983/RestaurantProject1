package by.restaurant.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "worker_table")
@Data
@NoArgsConstructor

public class Worker extends User {

}
