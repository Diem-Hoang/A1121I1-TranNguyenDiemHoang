package com.codegym.repository;

import com.codegym.entity.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class MusicRepositoryImpl implements IMusicRepository{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(Music music) {

    }

    @Override
    public void update(Music music) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Music> findAll() {
        List<Music> musicList = entityManager.createQuery("select m from  Music m ").getResultList();
        return  musicList;
    }

    @Override
    public Music findById(String id) {
        return null;
    }
}

