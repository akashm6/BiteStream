package com.BiteStream.BiteStream;

import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserProfile {

    private String bio;

    @ElementCollection
    private ArrayList<String> cuisines;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user_id")
    private ArrayList<Review> reviews;

}
