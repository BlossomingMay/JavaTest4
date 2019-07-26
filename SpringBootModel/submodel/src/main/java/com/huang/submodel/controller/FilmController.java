package com.huang.submodel.controller;

import com.github.pagehelper.PageInfo;
import com.huang.submodel.domain.Film;
import com.huang.submodel.domain.Page;
import com.huang.submodel.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    FilmService filmService;

    @GetMapping("/")
    public PageInfo<Film>  getFimls(Page page){

        return filmService.getFilms(page);
    }

//    @PostMapping("/")
//    public PageInfo<Film>  getFimls(@RequestBody Page page){
//        return filmService.getFilms(page);
//    }


}
