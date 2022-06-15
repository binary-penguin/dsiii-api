package com.example.dsiiiarchive.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Game {

    private String name;
    private String description;
    private String dev;
    private String composer;
    private int metacritic;
    private boolean goty;
    private Date release_date;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Game() {

    }

    public Game(String name, String description, String dev, String composer, int metacritic, boolean goty, Date sqlDate, Long id) {
        this.name = name;
        this.description = description;
        this.dev = dev;
        this.composer = composer;
        this.metacritic = metacritic;
        this.goty = goty;
        this.release_date = release_date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(int metacritic) {
        this.metacritic = metacritic;
    }

    public boolean isGoty() {
        return goty;
    }

    public void setGoty(boolean goty) {
        this.goty = goty;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
