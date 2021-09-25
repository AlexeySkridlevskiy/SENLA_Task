package database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class order_items {

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long order_id;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private Long product_id;

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "quantity")
    private Long quantity;
}
