package com.homework210.homework210.controller;

import com.homework210.homework210.model.Item;
import com.homework210.homework210.service.StoreService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
            @RequestParam(value = "id1", required = false) Integer id1,
            @RequestParam(value = "id2", required = false) Integer id2
    ) {
        String id = null;
        if(id1 == null) {
            id = id1.toString();
        }
        if(id2 == null) {
            id = id2.toString();
        }
        if(id1 != null && id2 != null) {
            id = id1.toString() + id2.toString();
        }
        return storeService.add(id);
    }
    @GetMapping("/get")
    public Map<String, Item> get(
    ) {
        return storeService.get();
    }
}
