package com.angular.test.controller;

import com.angular.test.pojo.Hero;
import com.angular.test.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class HeroController {

    @Autowired private HeroRepository heroRepository;

    @GetMapping("heroes")
    public List<Hero> getHeroList() {
        List<Hero> heroList = heroRepository.findAll();
        return heroList;
    }

    @GetMapping("getHero/{id}")
    public Hero getHero(@PathVariable(name = "id") int id) {
         return heroRepository.getOne(id);
    }
}
