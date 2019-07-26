package com.huang.submodel.dao;


import com.huang.submodel.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CustomerMapper {

    void deleteCustomer(@Param("customerId") int customerId);

    void updateCustomer(Customer user);

    void insertCustomer(Customer user);

    Integer findAddressId(@Param("address") String address);

}
