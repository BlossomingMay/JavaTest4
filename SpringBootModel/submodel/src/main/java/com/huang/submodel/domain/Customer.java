package com.huang.submodel.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
    private int customerId;
    private int storeId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private int addressID;

}
