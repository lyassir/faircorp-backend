package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.dao.BuildingDao;
import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BuildingDaoTest {
    @Autowired
    private BuildingDao buildingDao;

    @Test
    public void shouldFindABuilding() {
        Building building = buildingDao.getOne(-10L);
        Assertions.assertThat(building.getName()).isEqualTo("Building1");
    }

    @Test
    public void shouldFindBuildingWindows(){
        List<Window> result = buildingDao.findWindowsByBuildingId(-10L);
        Assertions.assertThat(result).hasSize(2);
    }

    @Test
    public void shouldFindBuildingHeaters(){
        List<Heater> result = buildingDao.findHeatersByBuildingId(-10L);
        Assertions.assertThat(result).hasSize(2);
    }
}