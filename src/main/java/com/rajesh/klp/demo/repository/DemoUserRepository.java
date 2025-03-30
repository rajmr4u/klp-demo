package com.rajesh.klp.demo.repository;

import java.util.List;



import com.rajesh.klp.demo.entity.DemoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoUserRepository extends JpaRepository<DemoUser, Integer> {
     List<DemoUser> findByType(String type);

}
