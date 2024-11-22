package com.BiteStream.BiteStream;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String bio;

    @ElementCollection
    private List<String> cuisines;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user_id")
    private List<Review> reviews;

}
