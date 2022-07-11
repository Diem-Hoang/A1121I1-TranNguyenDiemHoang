package com.codegym.repository;

import com.codegym.entity.Music;

import java.util.List;

public interface IMusicRepository {
    void create(Music music);
    void update(Music music);
    void delete(String id);
    List<Music> findAll();
    Music findById(String id);
}
