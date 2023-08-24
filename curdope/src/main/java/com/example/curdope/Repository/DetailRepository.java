package com.example.curdope.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curdope.Model.Details;

@Repository
public interface DetailRepository extends JpaRepository<Details, Long> {

}
