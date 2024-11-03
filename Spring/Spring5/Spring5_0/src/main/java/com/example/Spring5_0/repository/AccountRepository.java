package com.example.Spring5_0.repository;


import com.example.Spring5_0.model.Account;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    @Query("select * from account where name = :name")
    List<Account> findAccountsByName(String name);

    @Modifying
    @Query("update account set amount = :amount where id = :id")
    void changeAmount(long id, BigDecimal amount);
}
