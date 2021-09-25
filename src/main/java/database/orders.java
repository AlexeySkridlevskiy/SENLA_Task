package database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class orders {

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long user_id;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "status")
    private String status;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "created_at")
    private Long created_at;
}
