package com.example.democonnectmysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HibernateConection extends JpaRepository<Person,Integer> {
    @Query(value = "select * from Person",nativeQuery = true)
    List<Person> getAllIlike();
}
