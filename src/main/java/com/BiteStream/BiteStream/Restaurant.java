package com.BiteStream.BiteStream;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Restaurant {

    @Id
    private String id;

    private String name;

    @ElementCollection
    private List<String> cuisines;

    private String address;

    @Transient
    private Integer averageRating;

    private String priceRange;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    private List<Review> reviews;

    public Integer getAverageRating() {
        if (reviews == null || reviews.size() == 0) {
            return 0;
        }
        int totalRatings = 0;
        for (Review review : reviews) {
            totalRatings += review.getRating();
        }

        return totalRatings / reviews.size();
    }
}
