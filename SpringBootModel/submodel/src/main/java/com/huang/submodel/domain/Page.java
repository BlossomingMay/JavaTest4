package com.huang.submodel.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page {
    private int pageSize;
    private int page;
    private String sort = "ASC";
}
