package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
public class Dish {
    @Id
    @GeneratedValue
    private long id;

    private String dishId;
    private String name;
    private String cuisine;
    private int preparationTime;
    private boolean liked;

    @ManyToOne
    private Chef chef;

    public Dish(String dishId, String name, String cuisine, int preparationTime,Chef chef) {
//        this.id = (long) (Math.random() * 1000);
        this.liked = false;
        this.dishId = dishId;
        this.name = name;
        this.cuisine = cuisine;
        this.preparationTime = preparationTime;
        this.chef = chef;
    }
}

