package com.crud_demo.dao;
import com.crud_demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserDao extends JpaRepository<User,Integer> {

    @Query("select b from User b where b.username =:username")
    User findByUsername(String username);

    @Query("select b from User b where b.id =:id")
    User findByUserId(Integer id);

}
