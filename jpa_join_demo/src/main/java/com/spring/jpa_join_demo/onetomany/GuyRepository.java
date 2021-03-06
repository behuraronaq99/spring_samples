package com.spring.jpa_join_demo.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuyRepository extends JpaRepository<Guy, Long> {

}
