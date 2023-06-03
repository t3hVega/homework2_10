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
    public Item add(
            @RequestParam("id1") HashSet<Integer> id1
            ) {
        Iterator itr = id1.iterator();
        String id = null;
        while (itr.hasNext()) {
            id=id + itr.next().toString();
        }
        return storeService.add(id);
    }
    @GetMapping("/get")
    public Map<String, Item> get(
    ) {
        return storeService.get();
    }
}
