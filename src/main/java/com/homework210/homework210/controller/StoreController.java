package com.homework210.homework210.controller;

import com.homework210.homework210.model.Item;
import com.homework210.homework210.service.StoreService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@Scope("session")
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/add")
    public List<Integer> add(
            @RequestParam("id") List<Integer> id
            ) {
        return storeService.add(id);
    }
    @GetMapping("/get")
    public Set<Integer> get(
    ) {
        return storeService.get();
    }
}
