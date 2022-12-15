package com.seroja.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "stadium")
public class Stadium {

    public Stadium(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 30)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "directod_id")
    private Director directod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director getDirectod() {
        return directod;
    }

    public void setDirectod(Director directod) {
        this.directod = directod;
    }

}