package com.huang.submodel.service;

import com.huang.submodel.dao.CustomerMapper;
import com.huang.submodel.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    CustomerMapper customerMapper;

    public void delete(int id){

        customerMapper.deleteCustomer(id);
        logger.info("成功删除");
    }

    public void insert(Customer customer){
        Integer addressId = customerMapper.findAddressId(customer.getAddress());
        if(addressId==null){
            logger.warn("The address is wrong!!!!!!!!!!  插入的地址错误");
            return;
        }else{
            customer.setAddressID(addressId);

            customer.setStoreId(1);
            customerMapper.insertCustomer(customer);
            logger.info("成功插入customer！");
        }

    }

    public void update(Customer customer){
        Integer addressId = customerMapper.findAddressId(customer.getAddress());
        if(addressId==null){
            logger.warn("The address is wrong!!!!!!!!!!  更新的地址错误");
            return;
        }else{
         customerMapper.updateCustomer(customer);
         logger.info("成功更新customer");
        }
    }



}
