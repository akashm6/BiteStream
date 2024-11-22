package com.BiteStream.BiteStream;

import java.util.Set;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private UserProfile profile;

    @ManyToMany
    @JoinTable(name = "user_favorites", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private Set<Restaurant> favoriteRestaurants;

    private String name;

    private String email;

    private String location;

    private Integer numCoins;

    private Integer achievementsCompleted;

    protected User() {
    }

}
