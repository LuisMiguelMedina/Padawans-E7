package com.encora.movieapi.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "raitings")
public class Raitings implements Serializable {
    @Id
    @Column(
            name = "raiting_id",
            nullable = false,
            unique = true
    )
    private int  raintingId;

    @Column(
            name = "time",
            nullable = false
    )
    private Time time;

    @Column(
            name = "summary",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String summary;

    @Column(
            name = "review",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String review;

    //Muchos ratings tienen un a pelicula
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movies_id")
    private Movies movie;

    public  Raitings() {}

    public Raitings(int raintingId, Time time, String summary, String review) {
        this.raintingId = raintingId;
        this.time = time;
        this.summary = summary;
        this.review = review;
    }

    public int getRaintingId() {
        return raintingId;
    }

    public void setRaintingId(int raintingId) {
        this.raintingId = raintingId;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
