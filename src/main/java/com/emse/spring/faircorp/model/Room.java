package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.Set;

//JPA ENTITY(1)
@Entity
//Give a name to the table(2)
@Table(name = "ROOM")
public class Room{
    // (3)
    @Id
    @GeneratedValue
    private Long id;

    // (4)
    @Column(nullable = false)
    private int floor;

    // (5)
    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private Double currenttemp;
    @Column(nullable = true)
    private Double targettemp;

    @OneToMany(mappedBy = "room")
    private Set<Heater> heaters;
    //@Column(nullable = false)

    @OneToMany(mappedBy = "room")
    private Set<Window> windows;

    @ManyToOne
    private Building building;

    // Default constructor
    public Room() {
    }

    public Room(Building building, int floor, String name, double currenttemp, double targettemp) {
        this.floor = floor;
        this.name = name;
        this.currenttemp = currenttemp;
        this.targettemp = targettemp;
        this.building = building;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor(){
        return floor;
    }
    public void setFloor(int floor){
        this.floor = floor;
    }

    public Double getCurrenttemp(){
        return currenttemp;
    }
    public void setCurrenttemp(double currenttemp){
        this.currenttemp = currenttemp;
    }

    public Double getTargettemp(){
        return targettemp;
    }
    public void setTargettemp(double targettemp){
        this.targettemp = targettemp;
    }
    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

}


