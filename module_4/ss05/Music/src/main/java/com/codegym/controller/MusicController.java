package com.codegym.controller;

import com.codegym.entity.Music;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;
    @GetMapping("music")
    public  String showMusic(Model model){
        List<Music> musicList = musicService.findAll();
        model.addAttribute("list", musicList );
        return "view";
    }

}
