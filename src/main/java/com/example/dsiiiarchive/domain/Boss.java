package com.example.dsiiiarchive.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter @NoArgsConstructor @AllArgsConstructor
public class Boss {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="location_id", nullable=false)
    private Location location;

    private String name;
    private String image_url;
    private int health;
    private String description;
    private String lore;
    private boolean parryable;
    private boolean optional;
}
