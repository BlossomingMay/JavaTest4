package com.huang.submodel.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@Setter
public class User implements Serializable {

        private static final long serialVersionUID = 1L;

        private String name;
        private String password;

}
