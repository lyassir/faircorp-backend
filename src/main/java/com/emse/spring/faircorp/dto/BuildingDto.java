package com.emse.spring.faircorp.dto;

import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Room;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class BuildingDto {
    private Long id;
    private String name;
    private Set<Long> roomIds;

    public BuildingDto() {}

    public BuildingDto(Building building) {
        this.id = building.getId();
        this.name = building.getName();
        this.roomIds = new HashSet<Long>();
        for (Room room : building.getRooms()) {
            this.roomIds.add(room.getId());
        }
    }

    public Long getId() {
        return id;
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
    public Set<Long> getRoomIds() {
        return roomIds;
    }
    public void setRoomIds(Set<Long> roomIds) {
        this.roomIds = roomIds;
    }
}