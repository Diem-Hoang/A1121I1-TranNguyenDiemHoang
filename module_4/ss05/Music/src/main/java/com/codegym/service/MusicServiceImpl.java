package com.codegym.service;

import com.codegym.entity.Music;
import com.codegym.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService{
    private IMusicRepository musicRepository ;
    @Autowired
    public  MusicServiceImpl (IMusicRepository musicRepository){
        this.musicRepository = musicRepository;
    }

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
        return musicRepository.findAll();
    }

    @Override
    public Music findById(String id) {
        return null;
    }
}
