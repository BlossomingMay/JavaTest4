package com.huang.submodel.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huang.submodel.dao.FilmMapper;
import com.huang.submodel.domain.Film;
import com.huang.submodel.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmMapper filmMapper;

//    public List<Film> getFilms(){
//        return filmMapper.getFilms();
//    }


    public PageInfo<Film> getFilms(Page page){

        PageHelper.startPage(page.getPage(),page.getPageSize());
        List<Film> list  = filmMapper.getFilms();
        PageInfo<Film> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
