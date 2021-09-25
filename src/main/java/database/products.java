package database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class products {

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "name")
    private String name;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "price")
    private Long price;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "status")
    private String status;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "created_at")
    private String created_at;
}
