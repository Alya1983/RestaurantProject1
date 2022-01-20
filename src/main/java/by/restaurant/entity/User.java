package by.restaurant.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;


@Entity//обозначается сущность
@Table(name = "users_table")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
@Inheritance(strategy = InheritanceType.JOINED)
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // генерирует в базе данных id по каким то данным

    @Column
    private Long id;

    @Column
    private String username;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
//многие ко многим (один пользователь может иметь несколько ролей с одной стороны и у одной роли может быть несколько пользователей с другой)
    private Set<Role> roles;
//(fetch = FetchType.EAGER)список ролей загружается вместе с пользователем сразу (не ждет пока к нему обратятся).

}
