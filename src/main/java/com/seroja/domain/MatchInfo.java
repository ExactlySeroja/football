package com.seroja.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "matchInfo")
public class MatchInfo {

    public MatchInfo(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_country", length = 30)
    private String firstCountry;

    @Column(name = "second_country", length = 30)
    private String secondCountry;

    @Column(name = "date")
    private LocalDate date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstCountry() {
        return firstCountry;
    }

    public void setFirstCountry(String firstCountry) {
        this.firstCountry = firstCountry;
    }

    public String getSecondCountry() {
        return secondCountry;
    }

    public void setSecondCountry(String secondCountry) {
        this.secondCountry = secondCountry;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}