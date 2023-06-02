package com.homework210.homework210.service;

import com.homework210.homework210.model.Item;

import java.util.HashMap;
import java.util.Map;

public interface StoreService {
    Item add(String id);
    Map<String, Item> get();
}
