package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class HeaterDaoCustomImpl implements HeaterDaoCustom{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void deleteByRoomId(Long id) {
        String jpql = "select r from Heater r where r.room.id = :id";
        List<Heater> heaterList = em.createQuery(jpql, Heater.class).setParameter("id", id).getResultList();
        for (Heater heater : heaterList) {
            em.remove(heater);
        }
    }
}