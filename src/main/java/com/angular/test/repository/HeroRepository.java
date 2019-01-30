package com.angular.test.repository;

import com.angular.test.pojo.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero,Integer> {
}
