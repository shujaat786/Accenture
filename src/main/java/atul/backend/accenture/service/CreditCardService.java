package atul.backend.accenture.service;

import atul.backend.accenture.entity.CreditCardEntity;

import java.util.List;


public interface CreditCardService {

    List<CreditCardEntity> getAllCustomersList();

    Boolean deleteUser(Integer id);

    CreditCardEntity getCustomerById(Integer id);
}