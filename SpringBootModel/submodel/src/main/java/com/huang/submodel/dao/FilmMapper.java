package com.huang.submodel.dao;

import com.huang.submodel.domain.Film;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FilmMapper {

    List<Film> getFilms();
}
