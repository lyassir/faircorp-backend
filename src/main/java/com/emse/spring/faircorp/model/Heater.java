package com.emse.spring.faircorp.model;

import javax.persistence.*;
//JPA ENTITY(1)
@Entity
//Give a name to the table(2)
@Table(name = "HEATER")
public class Heater {
        // (3)
        @Id
        @GeneratedValue
        private Long id;

        // (4)
        @Column(nullable = false, length = 255)
        private String name;

        // (5)
        @Column(nullable = true)
        private Long power;

        //@Column(nullable = false)

        //non nullable room
        @ManyToOne
        private Room room;

        @Enumerated(EnumType.STRING)
        private HeaterStatus heaterStatus;

        // Default constructor
        public Heater() {
        }

        public Heater(Room room, String name, long power, HeaterStatus status) {
            this.heaterStatus = status;
            this.name = name;
            this.power = power;
            this.room = room;
        }

        public long getId() {
            return this.id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        
        public long getPower(){
            return power;
        }
        
        public void setPower(long power){
            this.power = power;
        }
        public void setName(String name) {
            this.name = name;
        }

        public HeaterStatus getHeaterStatus() {
            return heaterStatus;
        }

        public void setHeaterStatus(HeaterStatus heaterStatus) {
            this.heaterStatus = heaterStatus;
        }
        public void setRoom(Room room) {
            this.room = room;
        }

        public Room getRoom() {
            return room;
        }
    }

